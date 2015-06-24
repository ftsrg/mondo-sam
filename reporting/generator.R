generatePlots <- function(result, data, config, plotContainer, filterContainer, publisher, serializer){
  for(row in 1:nrow(config$Plot)){
    result$setFrame(data)
    
    legend <- config$Plot[row, ]$Legend
    specLegends <- unlist(config$Plot[row, ]$Legend_Filters)
    if (is.list(specLegends)){
      specLegends <- unlist(specLegends)
    }
    if (!is.na(specLegends)){
      result$.frame <- result$.frame[which(result$.frame[[legend]] %in% specLegends), ]
    }
    
    metrics <- config$Plot[row, ]$Metrics
    if (is.list(metrics)){
      metrics <- unlist(metrics)
    }
    
    phases <- config$Plot[row, ]$Summarize_Function
    if (is.list(phases)){
      phases <- unlist(phases)
    }
    result$.frame <- subset(result$.frame, MetricName %in% metrics & 
                              PhaseName %in% phases)
    
    result$createSubFrames()
    
    filterContainer$setResult(result)
    filterContainer$init()
    
    plotContainer$.plotSettings$init(filterContainer)
    plotContainer$.theme$init()
    
    serializer$.filterContainer <- filterContainer
    serializer$.plotContainer <- plotContainer
    serializer$.publisher <- publisher
    
    serializer$import(config$Plot[row, ])
    
    filterContainer$.selections$changeSelections(filterContainer$.legend$.selectedState, filterContainer$.xDimension$.selectedState)
    
    filterContainer$.scenario$update()
    filterContainer$.tool$update()
    filterContainer$.case$update()
    filterContainer$.size$update()
    filterContainer$.iteration$update()
    
    publisher$publish(filterContainer, plotContainer, filterContainer$.selections$.selections, verbose = TRUE)
    
  }
}