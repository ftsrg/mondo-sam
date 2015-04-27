library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("shiny", quietly=T, verbose=F, warn.conflicts=FALSE)
source("functions.R")
source("plot.R")

shinyServer(function(input, output, session) {
    
  values <- reactiveValues(iteration = c(0,0), 
                           mix = FALSE,
                           selections = c("Scenario", "Tool", "CaseName", "Size"),
                           templates = list(CaseName="CaseName", 
                                            Scenario="Scenario", 
                                            PhaseName="PhaseName", 
                                            MetricName="MetricName"),
                           defaultSelections = c("Scenario", "Tool", "CaseName", "Size"),
                           legends = c("CaseName", "Tool", "MetricName", "Scenario"),
                           unique_cases = c(),
                           unique_tools = c(),
                           unique_metrics = c(),
                           unique_scenarios = c(),
                           update="",
                           scenarioObserver=0, 
                           toolObserver=0, 
                           caseObserver=0, 
                           sizeObserver=0, 
                           phaseObserver=0, 
                           metricObserver=0,
                           settings = PlotSettings(theme="Default")
                          )
  
  # style settings like title, labels etc
#   values$settings <- PlotSettings(theme="Default")
#   values$selections = list(Scenario="Scenario", Tool="Tool", Size="Size", CaseName="CaseName")
 
# load results and make reactiv values
  # the various subframes can be accessed by the following formula: values$subtables[[casename]][[scenario]][[phasename]]
  output$load <- renderUI({
    inFile <- input$file
    
    if (is.null(inFile))
      return()
    isolate({
      values$results <- read.csv(inFile$datapath, header=TRUE, sep=input$sep, 
                                 quote=input$quote)
      
      withProgress(message = 'Processing', value = 1.0, {
        values$unique_cases <- as.character(unique(values$results$CaseName))
        values$unique_tools <- as.character(unique(values$results$Tool))
        values$unique_sizes <- as.character(unique(values$results$Size))
        values$unique_scenarios <- as.character(unique(values$results$Scenario))
        s <- proc.time()
        values$subFrames <- NULL
        createSubFrames(values$results, c("Scenario"))
        createSubFrames(values$results, c("Tool"))
        createSubFrames(values$results, c("CaseName"))
        createSubFrames(values$results, c("Scenario", "Tool"))
        createSubFrames(values$results, c("Scenario", "CaseName"))
        createSubFrames(values$results, c("Tool", "CaseName"))
        createSubFrames(values$results, c("Scenario", "Tool", "CaseName"))
        t <- proc.time()
        elapsed <- t-s
        print(elapsed)
        updateTabsetPanel(session, "reporting", selected = "Results")
        print(values$subFrames[["ID.Batch.EMFIncQuery.PosLength"]])
        print(names(values$subFrames))
      
      })
    })
  })
  
  # observer for plot specific adjustments like title, labels, scales and the like
  changeSettings <- observe({
    # add dependency
    if (is.null(input$visualize)){
      return()
    }
    
    isolate({
      if (is.null(input$case))
        return()
      if (is.null(input$phase))
        return()
      if (is.null(input$scenario))
        return()
      if (is.null(input$metric))
        return()
#       if (is.null(input$mix))
#         return()
      if (is.null(input$xaxis) | is.null(input$yaxis)){
        values$settings <- setAxis(values$settings, "Continuous", "Continuous")
      }
      if (is.null(input$theme)){
        values$settings <- setTheme(values$settings, "Default")
      }
      if (input$xlabel == ""){
        xLabel <- input$xdimension
      }
      else{
        xLabel <- input$xlabel
      }
      if (input$ylabel == ""){
        yLabel <- input$metric
      }
      else{
        yLabel <- input$ylabel
      }
      values$settings <- setLabels(values$settings, xLabel, yLabel)
      
      title <- isolate(input$title)
      title <- gsub("CASENAME", input$case, title)
      if (values$mix == TRUE){
        phases <- ""
        for(p in input$mixphase)
          phases  <- paste(phases, p, sep=' ')
        title <- gsub("PHASENAME", phases, title)
      }
      title <- gsub("PHASENAME", input$phase, title)
      title <- gsub("METRICNAME", input$metric, title)
      title <- gsub("SCENARIO", input$scenario, title)
      values$settings <- setTitle(values$settings, title)
      
      values$settings <- setAxis(values$settings, input$xaxis, input$yaxis)
      values$settings <- setTheme(values$settings, input$theme)
      values$settings <- setYScale(values$settings, input$yscale)
      values$settings <- showValues(values$settings, input$showValues)
    })
  })
  
  changeIteration <- observe({
    if (is.null(input$iteration))
      return()
    values$iteration <- input$iteration
    
  })
  
  changeMix <- observe({
    if (is.null(input$mix)){
      return()
    }
    values$mix <- input$mix
  })
  
  changeTemplates <- observe({
    dimension <- input$xdimension
    isolate({
      if (dimension != "Size"){
        values$templates <- c(values$templates, Size="Size")
        updateSelectInput(session, "titleTemplate", label="Template",
                          choices=values$templates)
        updateSelectInput(session, "publishTemplate", label="Template",
                          choices=values$templates)
      }
      else {
        if ("Size" %in% names(values$templates)){
          values$templates <- values$templates[ - which(names(values$templates) == "Size")]
          updateSelectInput(session, "titleTemplate", label="Template",
                            choices=values$templates)
          updateSelectInput(session, "publishTemplate", label="Template",
                            choices=values$templates)
        }
      }
    })
    
  })

  # observer for title
  appendTitle <- observe({
    # create dependency to the titleInsert button
    if(input$titleInsert == 0)
      return()
    isolate({
      titleTemplate <- toupper(input$titleTemplate)
      oldTitle <- input$title
      updateTextInput(session, "title", value = paste(oldTitle, titleTemplate))
    })
  })
  
  # observer for the filename
  changeFilename <- observe({
    # create dependency to the publishInsert button
    if(input$publishInsert == 0)
      return()
    
    publishTemplate <- toupper(isolate(input$publishTemplate))
    oldFilename <- isolate(input$filename)
    updateTextInput(session, "filename", value = paste(oldFilename, publishTemplate, sep=''))
  })
  
  # observer for publishing, saving the plots 
  publish <- observe({
    # create dependency to publish button
    if(input$publish == 0)
      return()
    isolate({
      filename <- input$filename
      format <- input$format
      file <- paste("../../diagrams/", filename, ".", tolower(format), sep='')
      file <- gsub("CASENAME", input$case, file)
      file <- gsub("METRICNAME", input$metric, file)
      if ("scenarios" %in% input$publishGroup == TRUE){
        for(scenario in names(values$subtables)){
          sub <- createSubFrame(scenario)
          if (is.null(sub))
            return()
          
          if (values$mix == TRUE){
            phases <- ""
            for(p in input$mixphase)
              phases  <- paste(phases, p, sep=' ')
            file <- gsub("PHASENAME", phases, file)
          }
          file <- gsub("PHASENAME", input$phase, file)
          newFile <- gsub("SCENARIO", scenario, file)
          plot <- createPlot(sub,values$settings)
          print(newFile)
          ggsave(plot = plot,filename = newFile, width=14, height=7, dpi=192)
        }
      }
      
    })
    
  })
  
  changeSelections <- observe({
    # add dependencies
    input$xdimension
    input$legend
    
    isolate({
      values$selections <- values$defaultSelections
      values$selections <- values$selections[values$selections != input$legend & 
                                             values$selections != input$xdimension]
    })
  })

  createSubFrames <- function(results, selections, id, index=0){
    if(length(selections) ==0){
      values$subFrames[[id]] <- results
    }
    else {
      selected <- selections[1]
      uniqueValues <- unique(results[[selected]])
      for(value in uniqueValues){
        if (index == 0){
          id <- "ID"
        }
        newId <- paste(id, value, sep=".")
        newResults <- results[results[[selected]] == value, ]
        value <- as.character(value)
        newSelections <- selections[selections != selected]
        index <- index + 1
        createSubFrames(newResults, newSelections, newId, index)
      }
    }
}

  getFrameID <- function(limit="Size"){
    isolate({
      id <- "ID"
      for(select in values$defaultSelections){
        if(select == limit){
          return(id)
        }
        if (select %in% values$selections){
          id <- paste(id, getValue(select), sep=".")
        }
      }
    })
  }
  
  getValue <- function(selected){
    isolate({
      if(selected == "Scenario"){
        return(input$scenario)
      }
      if(selected == "CaseName"){
        return(input$case)
      }
      if(selected == "Tool"){
        return(input$tool)
      }
      if(selected == "Size"){
        return(input$size)
      }
    })
  }
##################################
####         WIDGETS          ####
##################################


#####      RESULTS PANEL     #####
  output$plot <- renderPlot({
    input$visualize
    isolate({
      if (is.null(input$metric) | is.null(input$phase) | is.null(input$scenario) | is.null(input$case))
        return()
      # add dependencies
      input$iteration
      input$mixphase
      
      withProgress(message = 'Creating plot', value = 1.0, {
        sub <- createSubFrame(input$scenario)
        if (is.null(sub)){
          print("createSubFrame returned NULL!")
          return()
        }
        if (input$group == "Tool"){
          plot <- createPlot(sub, values$settings, "Tool", input$xdimension)
        }
        else if (input$group == "Case"){
          plot <- createPlot(sub, values$settings, "CaseName", input$xdimension)
        }
        # draw plot
        print(plot)
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
#     input$size
    
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

#####    DIMENSIONS PANEL    #####
  output$mix <- renderUI({
    if (is.null(input$xdimension)){
      return()
    }
    isolate({
      if (input$xdimension == "Size"){
        return(checkboxInput("mix", label = "Mix Phases", value = FALSE))
        if (is.null(input$mix) == FALSE){
          values$mix <- input$mix
        }  
      }
      else{
        values$mix <- FALSE
        # vanish widget
        return()
      }
    })
  })

#   output$xdimension <- renderUI({
#     selectInput("xdimension", label="X Dimension",
#                 choices = c(values$selections), selected = "Size")
#   })
# 
#   output$legend <- renderUI({
#     selectInput("legend", label="Legend",
#                 choices = c(values$selections), selected = "Tool")
#   })

#####   PLOT SETTINGS PANEL  #####
  output$titleTemplate <- renderUI({
    isolate({
      selectInput("titleTemplate", "Templates",
                  choices=values$templates)
    })
  })
#####      PUBLISH PANEL     #####
  output$publishTemplate <- renderUI({
    isolate({
      selectInput("publishTemplate", "Templates",
                  choices=values$templates)
  })
  })
  
})
