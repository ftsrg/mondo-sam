source("theme.R")

report <- function(results,selections, config, row, filename){
  if (length(selections) == 0){
    settings <- PlotSettings()
    
    settings <- setLegend(settings, config$Plot[row, ]$Legend)
    settings <- setTitle(settings, config$Plot[row, ]$Title)
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
  
  if("Iteration" %in% c(settings@xDimension, settings@legend)){
    data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size", "Iteration", "RunIndex"),
                  summarize, MetricValue=sum(MetricValue))
    data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size", "Iteration"),
                  summarize, MetricValue=median(MetricValue))
  }
  else {
    data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size", "RunIndex"),
                  summarize, MetricValue=sum(MetricValue))
    data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size" ),
                  summarize, MetricValue=median(MetricValue))
  }
  # TODO remove duplicate rows
#   if("MetricName" %in% c(settings@xDimension, settings@legend)){
#     data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size", "MetricName", "Iteration", "RunIndex"),
#                   summarize, MetricValue=sum(MetricValue))
#     data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size", "MetricName", "Iteration"),
#                   summarize, MetricValue=median(MetricValue))
#   }
#   else {
#     data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size", "MetricName", "RunIndex"),
#                   summarize, MetricValue=sum(MetricValue))
#     data <- ddply(data, c("CaseName", "Tool", "Scenario", "Size", "MetricName"),
#                   summarize, MetricValue=median(MetricValue))
#   }
  
  artifacts <- unique(data[[settings@xDimension]])
  
  minValue <- min(data$MetricValue)
  maxValue <- max(data$MetricValue)
  if (minValue == 0){
    print("The minimum metricvalue equals with 0. The plot cannot be generated.")
    return()
  }
  xLabels <- c(artifacts)
  
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
    ggsave(plot,filename = newFile, width=14, height=7, dpi=192)
    print(newFile)
  }
  
}

createFolders <- function(rootPath, subFolders){
  if (file.exists(rootPath) == FALSE){
    dir.create(rootPath)
  }
  for (folder in subFolders){
    path <- paste(rootPath, folder, sep='')
    if (file.exists(path) == FALSE){
      dir.create(path)
    }
  }
}

concatPhases <- function(phases){
  phases <- unlist(phases)
  first <- TRUE
  for(p in phases){
    if(first){
      merged <- p
      first <- FALSE
    }
    else{
      merged <- paste(merged, p, sep='+')
    }
  }
  return(merged)
}

getXLabels <- function(artifacts){
  ticks <- c()
  for(size in artifacts){
    value <- labels[[as.character(size)]]
    if(is.null(value)){
      value = size
    }
    ticks <- c(ticks, value)
  }
  return(ticks)
}