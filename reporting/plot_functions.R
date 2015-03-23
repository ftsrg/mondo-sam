source("theme.R")
source("util.R")

report <- function(results,selections, config, row, filename){
  if (length(selections) == 0){
    settings <- PlotSettings()
    
    settings <- setLegend(settings, config$Plot[row, ]$Legend)
    title <- injectValues(results, config$Plot[row, ]$Title)
    settings <- setTitle(settings, title)
    settings <- setDimensions(settings, config$Plot[row, ]$X_Dimension, "MetricValue")
    settings <- setLabels(settings, config$Plot[row, ]$X_Dimension, config$Plot[row, ]$Y_Label)
    settings <- setAxis(settings, config$Plot[row, ]$X_Axis_Scale, config$Plot[row, ]$Y_Axis_Scale)
    
    phases <- config$Plot[row, ]$Summarize_Function
    extensions <- config$Plot[row, ]$Extensions
    filename <- paste(filename, "Function", row, sep="-")
    savePlot(results, settings, phases, filename, extensions)
    return()
  }
  
  #get first select condition
  selected <- selections[1]
  uniqueValues <- unique(results[[selected]])
  for(value in uniqueValues){
    subData1 <- results[which(results[[selected]] == value), ]
    newSelections <- selections[selections != selected]
    newFilename <- paste(filename, value, sep="-")
    report(subData1, newSelections, config, row, newFilename)
  }
}

savePlot <-function(results, settings, phases, filename, extensions){
  data <- subset(results, PhaseName %in% unlist(phases))
  if (nrow(data) == 0) {
    return()
  }
  
  header <- names(data)
  cases <- c(settings@xDimension, settings@legend)
  header <- header[header != "Sequence"]
  header <- header[header != "MetricValue"]
  if ("Iteration" %in% cases == FALSE){
    header <- header[header != "Iteration"]
  }
  if ("MetricName" %in% cases == FALSE){
    header <- header[header != "MetricName"]
  }
  if ("PhaseName" %in% cases == FALSE){
    header <- header[header != "PhaseName"]
  }
  
  data <- ddply(data, header, summarize, MetricValue=sum(MetricValue))
  header <- header[header != "RunIndex"]
  data <- ddply(data, header, summarize, MetricValue=median(MetricValue))
  
  artifacts <- unique(data[[settings@xDimension]])
  xLabels <- getXLabels(settings@xDimension, artifacts)
  
  minValue <- min(data$MetricValue)
  maxValue <- max(data$MetricValue)
  if (minValue == 0){
    print("The minimum metricvalue equals with 0. The plot cannot be generated.")
    return()
  }
  
  if (settings@xAxis == "factor"){
    data[settings@xDimension] <- as.factor(data[[settings@xDimension]])
  }
  if (settings@yAxis == "factor"){
    data[settings@yDimension] <- as.factor(data[[settings@yDimension]])
  }
  
  plot <- ggplot(data,aes_string(x = settings@xDimension, y = settings@yDimension)) +
    geom_line(aes_string(group = settings@legend, colour=settings@legend), size=lineSize) + 
    geom_point(aes_string(shape = settings@legend, colour=settings@legend), size=pointSize) +
    scale_shape_manual(values=1:nlevels(data[[settings@legend]])) +
    ylab(settings@yLabel) +
    xlab(settings@xLabel) +
    ggtitle(label = settings@title) +
    bwTheme
  
  if(settings@xAxis != "factor"){
    if (settings@xAxis == "con"){
      plot <- plot + scale_x_continuous(breaks = c(artifacts))
    }
    else if (settings@xAxis == "log2"){
      plot <- plot + scale_x_log10(breaks = c(artifacts), labels = xLabels)
    }
  }
  else{
    plot <- plot + scale_x_discrete(labels = xLabels)
  }
  if (settings@yAxis != "factor"){
    if (settings@yAxis == "con"){
      plot <- plot + scale_y_continuous(breaks = seq(minValue, maxValue, by=round(maxValue/5,0)),
                                        labels = seq(minValue, maxValue, by=round(maxValue/5,0)))
    }
    else if (settings@yAxis == "log2"){
      plot <- plot + scale_y_log10(breaks = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),7), 
                                   labels = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),2))
    }
  }
  
  for (ext in unlist(extensions)){
    newFile <- paste(filename, ext, sep=".")
    ggsave(plot,filename = newFile, width=diagramWidth, height=diagramHeight, dpi=diagram_dpi)
    print(newFile)
  }
  
}