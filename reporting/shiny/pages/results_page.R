output$plot <- renderPlot({
  print("DRAW PLOT")
  # add dependency to "Draw Plot" button
  input$visualize
  isolate({
    if (is.null(input$metric) | is.null(input$phase) | is.null(input$scenario) | is.null(input$case))
      return(NULL)
    
    withProgress(message = 'Creating plot', value = 1.0, {
      # id identifies the certanly used data frame
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
      if (input$metric == ""){
        return()
      }
      if (input$phase == ""){
        return()
      }
      frame <- subset(frame, MetricName == input$metric & PhaseName == input$phase)
      if (values$iterations[1] > 0){
        frame <- subset(frame, Iteration >= values$iterations[1] & Iteration <= values$iterations[2])
      }
      print(nrow(frame))
      settings <- PlotSettings()
      
      settings <- setLegend(settings, input$legend)
      title <- injectValues(frame, input$title)
      settings <- setTitle(settings, title)
      settings <- setDimensions(settings, input$xdimension, "MetricValue")
      settings <- setLabels(settings, input$xlabel, input$ylabel)
      settings <- setAxis(settings, input$xaxis, input$yaxis)
      
#       phases <- config$Plot[row, ]$Summarize_Function
      phases <- list(input$phase)
#       extensions <- config$Plot[row, ]$Extensions
      extensions <- list("png")
#       filename <- paste(filename, "Function", row, sep="-")

      mappingPath <<- "../mapping.json"
      plot <- generatePlot(frame, settings, phases)
      print(plot)
    })
  })
})

output$scenario <- renderUI({
  print("scenario")
#   values$scenarioObserver
  isolate({
    values$toolObserver <- values$toolObserver + 1
  })
  if("Scenario" %in% values$selections == FALSE){
    # display nothing
    return()
  }
  isolate({
    
    scenario_list <- list()
    for(scen in values$unique_scenarios){
      scenario_list <- c(scen, scenario_list)
    }
    selectInput("scenario", "Scenarios",
                choices = scenario_list,
                selected = scenario_list[1]
    )
  })
})

output$tool <- renderUI({
  print("tool")
  values$toolObserver

  isolate({
    values$caseObserver <- values$caseObserver + 1
  })
  if(is.null(input$scenario)){
    print(input$scenario)
    print("null scenario in tool")
    return()
  }
  if("Tool" %in% values$selections == FALSE){
    # display nothing
    return()
  }

  
  isolate({
    
    id <- getFrameID("Tool")
    if(id == "ID"){
      uniqueTools <- values$unique_tools
    }
    else{
      uniqueTools <- unique(values$subFrames[[id]]$Tool)
    }
    tool_list <- list()
    for(tool in uniqueTools){
      tool_list <- c(tool, tool_list)
    }
    selectInput("tool", "Tool",
                choices = tool_list,
                selected = tool_list[1])
  })
})

output$case <- renderUI({
  print("case")
  values$caseObserver
  input$tool
  isolate({
    values$sizeObserver <- values$sizeObserver + 1
  })
  if("CaseName" %in% values$selections == FALSE){
    # display nothing
    return()
  }
#   if(is.null(input$tool)){
#     print("null tool in case")
#     return()
#   }
  #     input$scenario
  
  isolate({
    id <- getFrameID("CaseName")
    if(id == "ID"){
      uniqueCases <- values$unique_cases
    }
    else{
      uniqueCases <- unique(values$subFrames[[id]]$CaseName)
    }
    case_list <- list()
    for(case in uniqueCases){
      case_list <- c(case, case_list)
    }
    return(selectInput("case", "Case",
                       choices = case_list,
                       selected = case_list[0]
    ))
  })
})

output$size <- renderUI({
  print("size")
  values$sizeObserver
  input$case
  isolate({
    values$phaseObserver <- values$phaseObserver + 1
  })

  if("Size" %in% values$selections == FALSE){
    # display nothing
    return()
  }
  #     input$scenario
  #     input$tool
  
  isolate({
    
    id <- getFrameID("Size")
    print("print id in size:")
    print(id)
#     print(values$subFrames[[id]])
    if(id == "ID"){
      uniqueSizes <- values$unique_sizes
    }
    else{
      uniqueSizes <- unique(values$subFrames[[id]]$Size)
    }
    size_list <- list()
    for(size in uniqueSizes){
      size_list <- c(size, size_list)
    }
    size_list <- sort(as.numeric(size_list))
    selectInput("size", "Size",
                choices = size_list,
                selected = size_list[0]
    )
  })
})

output$phase <- renderUI({
  print("phase")
  # add dependency to phaseObserver
  values$phaseObserver
  input$size
  isolate({
    values$metricObserver <- values$metricObserver + 1
  })

  isolate({
    
    # id identifies the certanly used data frame
    id <- getFrameID()
    frame <- values$subFrames[[id]]
    if (is.null(frame)){
      return()
    }
    if ("Size" %in% values$selections){
      uniquePhases <- unique(subset(frame, Size == input$size)$PhaseName)
    }
    else{
      uniquePhases <- unique(frame$PhaseName)
    }
    
    phaseList <- list()
    for(phase in uniquePhases){
      phaseList <- c(phase, phase, phaseList)
    }
    
    selectInput("phase", "Phase",
                choices = phaseList,
                selected = phaseList[0]
    )
  })
})

output$metric <- renderUI({
  print("metric")
  values$metricObserver
  input$phase

  isolate({
    values$iterationObserver <- values$iterationObserver + 1
    
    if ("Size" %in% values$selections){
      # id identifies the certanly used data frame
      id <- getFrameID()
      frame <- values$subFrames[[id]]
      if (is.null(frame)){
        return()
      }
      uniqueMetrics <- unique(subset(frame, Size == input$size & PhaseName == input$phase)$MetricName)
    }
    else{
      print(input$phase)
      if (is.null(input$phase) || input$phase == ""){
        return()
      }
      # id identifies the certanly used data frame
      id <- getFrameID()
      frame <- values$subFrames[[id]]
      if (is.null(frame)){
        return()
      }
      uniqueMetrics <- unique(subset(frame, PhaseName == input$phase)$MetricName)
    }
    
    metricList <- list()
    for(metric in uniqueMetrics){
      metricList <- c(metric, metric, metricList)
    }
    
    selectInput("metric", "Metric",
                choices = metricList,
                selected = metricList[0]
    )
  })
})

output$iteration <- renderUI({
  print("iteration")
  input$metric
  values$iterationObserver
  
  isolate({
    values$iterations <- c(1,1)
    
    if (is.null(input$phase) || is.null(input$metric)){
      return()
    }
    phase <- input$phase
    metric <- input$metric
    if (phase == "" || metric == ""){
      return()
    }
    
    if ("Size" %in% values$selections){
      size <- input$size
      if (is.null(size)  || size == ""){
        return()
      }
      # id identifies the certanly used data frame
      id <- getFrameID()
      frame <- values$subFrames[[id]]
      if (is.null(frame)){
        return()
      }
      subFrame <- (subset(frame, Size == size & PhaseName == phase & MetricName == metric))
    }
    else{
      # id identifies the certanly used data frame
      id <- getFrameID()
      frame <- values$subFrames[[id]]
      if (is.null(frame)){
        return()
      }
      subFrame <- (subset(frame, PhaseName == phase & MetricName == metric))
    }
    maxIteration <- max(subFrame$Iteration)
    
    
    if(maxIteration > 1){
      if (values$iterations[[1]] == 0){
        minRange <- 1
        maxRange <- 1
      }
      else {
        minRange <- values$iterations[[1]]
        maxRange <- values$iterations[[2]]
      }
      sliderInput("iteration", "Iterations",
                  min=1,
                  max=maxIteration,
                  value=c(minRange, maxRange),
                  step=1
      )
    }
    else if (is.null(input$iteration) == FALSE){
      values$iterations <- c(0,0) # set to default
      return() # to remove slider
    }
      })
})