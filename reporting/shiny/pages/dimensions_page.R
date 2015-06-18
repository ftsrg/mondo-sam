output$xDimension <- renderUI({
  values$xDimensionObserver
  if (!is.null(values$filterContainer$.xDimension)){
    values$filterContainer$.xDimension$display()
  }
})


output$legend <- renderUI({
  values$legend
  if (!is.null(values$filterContainer$.legend)){
    values$filterContainer$.legend$display()
  }
})


output$legendFilters <- renderUI({
  print("legend filter ui")
  print(values$phases)
  if (is.null(values$metrics) || is.null(values$phases)){
    return()
  }
  
  isolate({
    id <- getFrameID()
    frame <- values$subFrames[[id]]
    frame <- subset(frame, PhaseName %in% values$phases & MetricName %in% values$metrics)
    uniqueLegends <- unique(frame[[input$legend]])
    legendsList <- list()
    for(leg in uniqueLegends){
      legendsList <- c(leg, legendsList)
    }
    values$legendFilters <- legendsList
    checkboxGroupInput("legendFilters",label="Filters",
                      choices=legendsList, selected=legendsList)
    
    
  })
})