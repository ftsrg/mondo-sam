output$plot <- renderPlot({
  # add dependency to "Draw Plot" button
  input$visualize
  isolate({
    if (is.null(input$metric) | is.null(input$phase) | is.null(input$scenario) | is.null(input$case))
      return()
    
    withProgress(message = 'Creating plot', value = 1.0, {
      frameID = getFrameID()
      frame <- values$subFrames[[frameID]]
      frame <- subset(frame, MetricName == input$metric)
      
      
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
      
      
      
#       
#       sub <- createSubFrame(input$scenario)
#       if (is.null(sub)){
#         print("createSubFrame returned NULL!")
#         return()
#       }
#       if (input$group == "Tool"){
#         plot <- createPlot(sub, values$settings, "Tool", input$xdimension)
#       }
#       else if (input$group == "Case"){
#         plot <- createPlot(sub, values$settings, "CaseName", input$xdimension)
#       }
#       # draw plot
#       print(plot)
    })
  })
})

output$scenario <- renderUI({
  print("scenario")
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
    print(scenario_list)
    print("before scen init")
    selectInput("scenario", "Scenarios",
                choices = scenario_list,
                selected = scenario_list[0]
    )
  })
})

output$tool <- renderUI({
  print("tool")
  
  values$toolObserver
  isolate({
    values$caseObserver <- values$caseObserver + 1
  })
  if("Tool" %in% values$selections == FALSE){
    # display nothing
    return()
  }
  if(is.null(input$scenario)){
    print(input$scenario)
    print("null scen")
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
  if(is.null(input$tool)){
    print("null tool in case")
    return()
  }
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
  isolate({
    values$phaseObserver <- values$phaseObserver + 1
  })
  if("Size" %in% values$selections == FALSE){
    # display nothing
    return()
  }
  # add dependency to case as well
  if(is.null(input$case)){
    print("null cse in size")
    return()
  }
  #     input$scenario
  #     input$tool
  
  isolate({
    
    id <- getFrameID("Size")
    print(id)
    print(values$subFrames[[id]])
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
  isolate({
    values$metricObserver <- values$metricObserver + 1
  })
  # add dependency to case as well
  if(is.null(input$case)){
    return()
  }
  
  #     input$scenario
  #     input$tool
  input$size
  
  isolate({
    
    id <- getFrameID()
    print(id)
    if ("Size" %in% values$selections){
      uniquePhases <- unique(subset(values$subFrames[[id]], Size == input$size)$PhaseName)
    }
    else{
      uniquePhases <- unique(values$subFrames[[id]]$PhaseName)
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
  #     if(is.null(input$case)){
  #       return()
  #     }
  #     input$scenario
  #     input$tool
  #     input$size
  if(is.null(input$phase)){
    return()
  }
  
  isolate({
    
    id <- getFrameID()
    
    if ("Size" %in% values$selections){
      uniqueMetrics <- unique(subset(values$subFrames[[id]], Size == input$size & 
                                       PhaseName == input$phase)$MetricName)
    }
    else{
      print(input$phase)
      uniqueMetrics <- unique(subset(values$subFrames[[id]], PhaseName == input$phase)$MetricName)
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
  #     # add dependencies
  #     input$phase
  #     values$mix
  #     if (is.null(input$metric))
  #       return()
  #     
  #     isolate({
  #       values$iteration <- c(1,1)
  #       if (values$mix == FALSE){
  #         max_value <- max(subset(values$subtables[[input$case]][[input$scenario]][[input$phase]], 
  #                                 MetricName == input$metric)$Iteration)
  #         if(max_value > 1){
  #           if (values$iteration[[1]] == 0){
  #             minRange <- 1
  #             maxRange <- 1
  #           }
  #           else {
  #             minRange <- values$iteration[[1]]
  #             maxRange <- values$iteration[[2]]
  #           }
  #           sliderInput("iteration", "Iterations",
  #                       min=1,
  #                       max=max_value,
  #                       value=c(minRange, maxRange),
  #                       step=1
  #           )
  #         }
  #         else if (is.null(input$iteration) == FALSE){
  #           values$iteration <- c(0,0) # set to default
  #           return() # to remove slider
  #         }
  #       }
  #     })
})