output$plot <- renderPlot({
  print("DRAW PLOT")
  # add dependency to "Draw Plot" button
  input$visualize
  isolate({
    if (is.null(input$metrics) | is.null(input$phases) | is.null(input$scenario) | is.null(input$case))
      return(NULL)
    
    withProgress(message = 'Creating plot', value = 1.0, {
      frameID = getFrameID()
      frame <- values$subFrames[[frameID]]
      if (is.null(frame)){
        return()
      }
      
      if ("Size" %in% values$selections){
        size <- input$size
        if (size == ""){
          return()
        }
        frame <- subset(frame, Size == input$size)
      }
      if (input$metrics == ""){
        return()
      }
      if (input$phases == ""){
        return()
      }
      frame <- subset(frame, MetricName %in% input$metrics & PhaseName %in% input$phases)
      legend <- input$legend
      frame <- frame[which(frame[[legend]] %in% input$legendFilters), ]
      if (values$iterations[1] > 0){
        frame <- subset(frame, Iteration >= values$iterations[1] & Iteration <= values$iterations[2])
      }
      print(nrow(frame))
      settings <- PlotSettings()
      
      settings <- setLegend(settings, legend)
      title <- injectValues(frame, input$title)
      settings <- setTitle(settings, title)
      settings <- setDimensions(settings, input$xdimension, "MetricValue")
      settings <- setLabels(settings, input$xlabel, input$ylabel)
      settings <- setAxis(settings, input$xaxis, input$yaxis)
      settings <- setYScale(settings, input$yscale)
      settings <- showTexts(settings, input$showValues)
      settings <- drawLines(settings, input$drawLines)
      
      frame$MetricValue <- frame$MetricValue * (10 ** input$yscale)
      
#       phases <- config$Plot[row, ]$Summarize_Function
#       phases <- list(input$phase)
#       extensions <- config$Plot[row, ]$Extensions
      extensions <- list("png")
#       filename <- paste(filename, "Function", row, sep="-")

      mappingPath <<- "../mapping.json"
      plot <- generatePlot(frame, settings, input$phases)
      print(plot)
    })
  })
})


output$scenario <- renderUI({
  print("scenario")
  values$scenarioObserver
  isolate({
    values$filterContainer$.scenario$display()  
  })
})


output$tool <- renderUI({
  print("tool")
  values$toolObserver
  isolate({
    values$filterContainer$.tool$display()  
  })
})


output$case <- renderUI({
  values$caseObserver
  isolate({
    values$filterContainer$.case$display()
  })
})


output$size <- renderUI({
  values$sizeObserver
  isolate({
    values$filterContainer$.size$display()
  })
})


output$phases <- renderUI({
#   print("phase")
#   # add dependency to phaseObserver
#   values$phaseObserver
#   values$size
#   isolate({
#     values$metricObserver <- values$metricObserver + 1
#   })
# 
#   isolate({
#     
#     # id identifies the certanly used data frame
#     id <- getFrameID()
#     frame <- values$subFrames[[id]]
#     if (is.null(frame)){
#       return()
#     }
#     if ("Size" %in% values$selections){
#       uniquePhases <- unique(subset(frame, Size == input$size)$PhaseName)
#     }
#     else{
#       uniquePhases <- unique(frame$PhaseName)
#     }
#     
#     phaseList <- list()
#     for(phase in uniquePhases){
#       phaseList <- c(phase, phase, phaseList)
#     }
#     values$phases <- ""
#     selectizeInput("phases", "Phases",
#                    choices = phaseList,
#                    multiple = TRUE,
#                    selected = NULL)
#   })
})

output$metrics <- renderUI({
#   print("metric")
#   values$metricObserver
#   values$phases
# 
#   isolate({
#     values$iterationObserver <- values$iterationObserver + 1
#     
#     if ("Size" %in% values$selections){
#       # id identifies the certanly used data frame
#       id <- getFrameID()
#       frame <- values$subFrames[[id]]
#       if (is.null(frame)){
#         return()
#       }
#       uniqueMetrics <- unique(subset(frame, Size == input$size & PhaseName %in% input$phases)$MetricName)
#     }
#     else{
#       print(input$phases)
#       if (is.null(input$phases) || input$phases == ""){
#         return()
#       }
#       # id identifies the certanly used data frame
#       id <- getFrameID()
#       frame <- values$subFrames[[id]]
#       if (is.null(frame)){
#         return()
#       }
#       uniqueMetrics <- unique(subset(frame, PhaseName %in% input$phases)$MetricName)
#     }
#     
#     metricList <- list()
#     for(metric in uniqueMetrics){
#       metricList <- c(metric, metricList)
#     }
#     if (length(metricList) == 1){
#       values$metrics <- c(metricList[1])
#       selectizeInput("metrics", "Metrics",
#                      choices = metricList,
#                      multiple = TRUE,
#                      selected = metricList[1])
#     }
#     else{
#       values$metrics <- ""
#       selectizeInput("metrics", "Metrics",
#                      choices = metricList,
#                      multiple = TRUE,
#                      selected = NULL)
#     }
#     
#   })
})

output$iteration <- renderUI({
#   print("iteration")
#   values$metrics
#   values$iterationObserver
#   
#   isolate({
#     values$iterations <- c(1,1)
#     
#     if (is.null(input$phases) || is.null(input$s)){
#       return()
#     }
#     phase <- input$phases
#     metric <- input$metrics
#     if (phase == "" || metric == ""){
#       return()
#     }
#     
#     if ("Size" %in% values$selections){
#       size <- input$size
#       if (is.null(size)  || size == ""){
#         return()
#       }
#       # id identifies the certainly used data frame
#       id <- getFrameID()
#       frame <- values$subFrames[[id]]
#       if (is.null(frame)){
#         return()
#       }
#       subFrame <- (subset(frame, Size == size & PhaseName %in% phase & MetricName %in% metric))
#     }
#     else{
#       id <- getFrameID()
#       frame <- values$subFrames[[id]]
#       if (is.null(frame)){
#         return()
#       }
#       subFrame <- (subset(frame, PhaseName %in% phase & MetricName %in% metric))
#     }
#     maxIteration <- max(subFrame$Iteration)
#     
#     
#     if(maxIteration > 1){
#       if (values$iterations[[1]] == 0){
#         minRange <- 1
#         maxRange <- 1
#       }
#       else {
#         minRange <- values$iterations[[1]]
#         maxRange <- values$iterations[[2]]
#       }
#       sliderInput("iteration", "Iterations",
#                   min=1,
#                   max=maxIteration,
#                   value=c(minRange, maxRange),
#                   step=1
#       )
#     }
#     else if (is.null(input$iteration) == FALSE){
#       values$iterations <- c(0,0) # set to default
#       return() # to remove slider
#     }
#       })
})