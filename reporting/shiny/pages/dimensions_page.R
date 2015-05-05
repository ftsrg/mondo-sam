output$legendFilters <- renderUI({
#   if (is.null(input$legend)){
#     return()
#   }
  if (is.null(input$metric) || is.null(input$phase)){
    return()
  }
  if (input$metric == "" || input$phase == ""){
    return()
  }
  
  isolate({
    id <- getFrameID()
    frame <- values$subFrames[[id]]
    frame <- subset(frame, PhaseName %in% input$phase & MetricName %in% input$metric)
    uniqueLegends <- unique(frame[[input$legend]])
    print(uniqueLegends)
    legendsList <- list()
    for(leg in uniqueLegends){
      legendsList <- c(leg, legendsList)
    }
    print(legendsList)
    checkboxGroupInput("legendFilters",label="Filters",
                      choices=legendsList, selected=legendsList)
    
    
  })
})