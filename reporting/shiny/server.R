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
#                            defaultSelections =  list(Scenario="Scenario", Tool="Tool", Size="Size", CaseName="CaseName"),
                           defaultSelections = c("Scenario", "Tool", "CaseName", "Size"),
                           legends = c("CaseName", "Tool", "MetricName", "Scenario"),
                           unique_cases = c(),
                           unique_tools = c(),
                           unique_metrics = c(),
                           unique_scenarios = c(),
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
#         createSubFrames(values$results, c("Scenario"))
#         createSubFrames(values$results, c("Scenario", "Tool"))
#         createSubFrames(values$results, c("Scenario", "Tool", "CaseName"))
#         createSubFrames(values$results, c("Scenario", "Tool", "CaseName", "Size"))
#         createSubFrames(values$results, c("Scenario", "Tool", "Size"))
#         createSubFrames(values$results, c("Scenario", "CaseName"))
#         createSubFrames(values$results, c("Scenario", "CaseName", "Size"))
#         createSubFrames(values$results, c("Scenario", "Size"))
#         createSubFrames(values$results, c("Tool", "CaseName", "Size"))
#         createSubFrames(values$results, c("Tool", "CaseName"))
#         createSubFrames(values$results, c("Tool", "Size"))
#         createSubFrames(values$results, c("CaseName", "Size"))
#         createSubFrames(values$results, c("CaseName"))

      updateTabsetPanel(session, "reporting", selected = "Results")
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
    print("selections called")
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

  getFrameID <- function(limit){
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
    print("output$plot")
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
    if("Scenario" %in% values$selections == FALSE){
      # display nothing
      return()
    }
    isolate({
      scenario_list <- list()
      for(scen in values$unique_scenarios){
        scenario_list <- c(scen, scen, scenario_list)
      }
      selectInput("scenario", "Scenarios",
                  choices = scenario_list,
                  selected = scenario_list[0]
                  )
    })
  })

  output$tool <- renderUI({
    print("tool called")
    if(is.null(input$scenario)){
      print("null tool")
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
    print("case called")
    if("CaseName" %in% values$selections == FALSE){
      # display nothing
      return()
    }
    if(is.null(input$tool)){
      print("null case")
      return()
    }
    isolate({
      id <- getFrameID("CaseName")
      print(id)
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
      selectInput("case", "Case",
                  choices = case_list,
                  selected = case_list[0]
                  )
    })
  })

output$size <- renderUI({
  if("Size" %in% values$selections == FALSE){
    # display nothing
    return()
  }
  if(is.null(input$case)){
    return()
  }
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
    if (is.null(input$scenario))
      return()
    # add dependency
    values$mix
    isolate({
      if(values$mix == FALSE){
        unique_phases <- names(values$subtables[[input$case]][[input$scenario]])
        if(length(unique_phases) == 0){
          return()
        }
        selectInput("phase", "Phases",
                    choices = unique_phases,
                    selected = unique_phases[0]
        )
      }
      else if(values$mix == TRUE){
        unique_phases <- unique(subset(values$results, Scenario == input$scenario & 
                                         CaseName == input$case &
                                         MetricName == input$metric)$PhaseName)
        
        phase_list <- list()
        if (length(unique_phases) == 0){
          return()
        }
        for(phase in unique_phases){
          phase_list <- c(phase, phase, phase_list)
        }
        selectizeInput(
          "mixphase", "Phases",
          choices = phase_list,
          selected = NULL,
          multiple = TRUE
        )
      }
    })
  })
  
  output$metric <- renderUI({
    if (is.null(input$phase))
      return()
    if (values$mix == FALSE){
      unique_metrics <- unique(values$subtables[[input$case]][[input$scenario]][[input$phase]]$MetricName)
      metricList <- list()
      if (length(unique_metrics) == 0){
        return()
      }
      for(metric in unique_metrics){
        metricList <- c(metric, metric, metricList)
      }
      
      selectInput("metric", "Metrics",
                  choices = metricList,
                  selected = metricList[0]
      )
    }
    else if(values$mix == TRUE){
      unique_metrics <- unique(subset(values$results, CaseName == input$case & 
                                        Scenario == input$scenario)$MetricName)
      metric_list <- list()
      if (length(unique_metrics) == 0){
        return()
      }
      for(metric in unique_metrics){
        metric_list <- c(metric, metric, metric_list)
      }
      selectInput("metric", "Metrics",
                  choices = metric_list,
                  selected = metric_list[0]
      )
    }
  })
  
  output$iteration <- renderUI({
    # add dependencies
    input$phase
    values$mix
    if (is.null(input$metric))
      return()
    
    isolate({
      values$iteration <- c(1,1)
      if (values$mix == FALSE){
        max_value <- max(subset(values$subtables[[input$case]][[input$scenario]][[input$phase]], 
                                MetricName == input$metric)$Iteration)
        if(max_value > 1){
          if (values$iteration[[1]] == 0){
            minRange <- 1
            maxRange <- 1
          }
          else {
            minRange <- values$iteration[[1]]
            maxRange <- values$iteration[[2]]
          }
          sliderInput("iteration", "Iterations",
                      min=1,
                      max=max_value,
                      value=c(minRange, maxRange),
                      step=1
          )
        }
        else if (is.null(input$iteration) == FALSE){
          values$iteration <- c(0,0) # set to default
          return() # to remove slider
        }
      }
    })
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
