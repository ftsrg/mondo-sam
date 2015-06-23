setConstructorS3(name = "PlotContainer", function(){
  extend(Object(), "PlotContainer",
         .plotSettings = PlotSettings(),
         .theme = Theme(),
         .plots = list(),
         .mappingJson = FALSE)
})


setMethodS3(name = "addPlot", class = "PlotContainer", function(p){
  if (is.null(p)){
    throw("Plot parameter is null in PlotContainer - addPlot")
  }
  this$.plots <- c(p, this$.plots)
})


setMethodS3(name = "pop", class = "PlotContainer", function(){
  return(this$.plots[[1]])
})


setMethodS3(name = "createPlot", class = "PlotContainer", function(this, filterContainer){
  if (is.null(filterContainer$.specificLegend$.selectedState)){
    return(NULL)
  }
  
  result <- filterContainer$.result
  id <- filterContainer$getFrameID()
  frame <- result$getSubFrame(id)
  
  if (is.null(frame)){
    return(NULL)
  }
  
  # filter size, phase, metric
  if (filterContainer$.size$enable("Size")){
    frame <- subset(frame, Size == filterContainer$.size$.selectedState & 
                      PhaseName %in% filterContainer$.phase$.selectedState &
                      MetricName %in% filterContainer$.metric$.selectedState)
  }
  else {
    frame <- subset(frame, PhaseName %in% filterContainer$.phase$.selectedState &
                      MetricName %in% filterContainer$.metric$.selectedState)
  }
  # filter legends
  frame <- frame[which(frame[[filterContainer$.legend$.selectedState]] %in% filterContainer$.specificLegend$.selectedState), ]

  # filter iterations
  if (!is.null(filterContainer$.iteration$.selectedState)){
    frame <- subset(frame, Iteration >= filterContainer$.iteration$.selectedState[1] & Iteration <= filterContainer$.iteration$.selectedState[2])
  }
  
  plot <- this$generatePlot(frame, filterContainer)
  this$.plots <- c(plot, this$.plots)
  return(plot)
})


setMethodS3(name = "generatePlot", class = "PlotContainer", private = TRUE, function(this, data, filterContainer){
  data$MetricValue <- data$MetricValue * (10 ** this$.plotSettings$.yScale)
  
  header <- names(data)
  cases <- c(this$.plotSettings$.xDimension, this$.plotSettings$.legend)
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
  
  artifacts <- unique(data[[this$.plotSettings$.xDimension]])
  xLabels <- this$getXLabels(this$.plotSettings$.xDimension, artifacts)
  
  minValue <- min(data$MetricValue)
  maxValue <- max(data$MetricValue)
  if (minValue == 0){
    print("The minimum metricvalue equals with 0. The plot cannot be generated.")
    return(NULL)
  }
  
  if (this$.plotSettings$.xAxis == "factor"){
    data[this$.plotSettings$.xDimension] <- as.factor(data[[this$.plotSettings$.xDimension]])
  }
  if (this$.plotSettings$.yAxis == "factor"){
    data[this$.plotSettings$.yDimension] <- as.factor(data[[this$.plotSettings$.yDimension]])
  }
  if (is.numeric(data[[this$.plotSettings$.xDimension]]) == FALSE){
    data[this$.plotSettings$.xDimension] <- as.factor(data[[this$.plotSettings$.xDimension]])
    this$.plotSettings$.xAxis = "factor"
  }
  if (is.numeric(data[[this$.plotSettings$.legend]]) || is.integer(data[[this$.plotSettings$.legend]])){
    data[this$.plotSettings$.legend] <- as.character(data[[this$.plotSettings$.legend]])
  }
  
  xLabel <- this$.plotSettings$.xLabel
  if (!is.null(xLabel)){
    if (xLabel == ""){
      xLabel <- this$.plotSettings$.xDimension
    }
  }
  else {
    xLabel <- this$.plotSettings$.xDimension
  }
  
  title <- this$.plotSettings$.title
  title <- filterContainer$injectStates(title)
  
  plot <- ggplot(data,aes_string(x = this$.plotSettings$.xDimension, y = this$.plotSettings$.yDimension)) +
    scale_shape_manual(values=1:nlevels(data[[this$.plotSettings$.legend]])) +
    ylab(this$.plotSettings$.yLabel) +
    xlab(xLabel) +
    ggtitle(label = title) +
    this$.theme$getTheme()
  
  if (this$.theme$.style == "black"){
    points <- geom_point(aes_string(shape = this$.plotSettings$.legend), size=this$.theme$.pointSize)
  }
  else {
    points <- geom_point(aes_string(shape = this$.plotSettings$.legend, colour=this$.plotSettings$.legend), size=this$.theme$.pointSize)
  }
  
  plot <- plot + points
  
  if (this$.plotSettings$.lines){
    if (this$.theme$.style == "black"){
      lines <- geom_line(aes_string(group = this$.plotSettings$.legend), size=this$.theme$.lineSize)
    }
    else {
      lines <- geom_line(aes_string(group = this$.plotSettings$.legend, colour=this$.plotSettings$.legend), size=this$.theme$.lineSize)
    }
    plot <- plot + lines
  }
  
  if(this$.plotSettings$.xAxis != "factor"){
    if (this$.plotSettings$.xAxis == "con"){
      plot <- plot + scale_x_continuous(breaks = c(artifacts))
    }
    else if (this$.plotSettings$.xAxis == "log2"){
      plot <- plot + scale_x_log10(breaks = c(artifacts), labels = xLabels)
    }
  }
  else{
    plot <- plot + scale_x_discrete(labels = xLabels)
  }
  if (this$.plotSettings$.yAxis != "factor"){
    if (this$.plotSettings$.yAxis == "con"){
      plot <- plot + scale_y_continuous(breaks = seq(minValue, maxValue, by=round(maxValue/5,0)),
                                        labels = seq(minValue, maxValue, by=round(maxValue/5,0)))
    }
    else if (this$.plotSettings$.yAxis == "log2"){
      plot <- plot + scale_y_log10(breaks = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),7), 
                                   labels = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),2))
    }
  }
  
  if (this$.plotSettings$.texts){
    plot <- plot + geom_text(aes(label=round(MetricValue, 2)))
  }
  
  return(plot)
})


setMethodS3(name = "getXLabels", class = "PlotContainer", function(this, dimension, artifacts){
  ticks <- c()
  if (this$.mappingJson){
#     mapping <- fromJSON(mappingPath)
  }
  else {
    for(item in artifacts){  
      ticks <- c(ticks, item)
    }
    return(ticks)
  }
#   for(item in artifacts){
#     if (as.character(item) %in% names(mapping[[dimension]])){
#       ticks <- c(ticks, mapping[[dimension]][[as.character(item)]])
#     }
#     else{
#       ticks <- c(ticks, item)
#     }
#   }
#   return(ticks)
})
