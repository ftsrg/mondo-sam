library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library(shiny, quietly=T, verbose=F, warn.conflicts=FALSE)
source("functions.R")
source("plot.R")

shinyServer(function(input, output, session) {
    
  values <- reactiveValues(iteration = c(0,0), 
                           mix = FALSE,
                           templates = list(CaseName="CaseName", 
                                            Scenario="Scenario", 
                                            PhaseName="PhaseName", 
                                            MetricName="MetricName"),
                           selections = c("Scenario", "Tool", "Size", "CaseName"),
                           legends = c("CaseName", "Tool", "MetricName", "Scenario"),
                           unique_cases = c(),
                           unique_tools = c(),
                           unique_metrics = c(),
                           unique_scenarios = c(),
                           settings = PlotSettings(theme="Default")
                          )
  
  # style settings like title, labels etc
#   values$settings <- PlotSettings(theme="Default")
  
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
        values$unique_cases <- unique(values$results$CaseName)
        values$unique_tools <- unique(values$results$Tool)
        values$unique_sizes <- unique(values$results$Size)
        values$unique_scenarios <- unique(values$results$Scenario)
        
        values$unique_cases <- as.character( values$unique_cases)
        values$unique_tools <- as.character( values$unique_tools)
        values$unique_sizes <- as.character( values$unique_sizes)
        values$unique_scenarios <- as.character( values$unique_scenarios)

        subtablesSize <- length(values$unique_cases)+length(values$unique_tools) + 
                         length(values$unique_sizes) +
                         length(values$unique_scenarios)
          
        values$subtables <- vector(mode="list", length=subtablesSize)
        names(values$subtables) <- c(values$unique_cases, values$unique_tools, 
                                     values$unique_sizes, values$unique_scenarios)

        for(case in values$unique_cases){
          subFrame <- values$results[values$results[["CaseName"]] == case, ]
          values$subtables[[case]] <- getSubFrames(subFrame, 
                                                   c("Tool", "Scenario", "Size"))
        }
        for(tool in values$unique_tools){
          subFrame <- values$results[values$results[["Tool"]] == tool, ]
          values$subtables[[tool]] <- getSubFrames(subFrame, 
                                                   c("CaseName", "Scenario", "Size"))
        }
        for(scenario in values$unique_scenarios){
          subFrame <- values$results[values$results[["Scenario"]] == scenario, ]
          values$subtables[[scenario]] <- getSubFrames(subFrame, 
                                                   c("CaseName", "Tool", "Size"))
        }
        for(size in values$unique_sizes){
          subFrame <- values$results[values$results[["Size"]] == size, ]
          values$subtables[[size]] <- getSubFrames(subFrame, 
                                                       c("CaseName", "Tool", "Scenario"))
        }
      })
    })
#     print(values$subtables)
  })
  
  # observer for plot specific adjustments like title, labels, scales and the like
  changeSettings <- observe({
    print("Change settings")
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
    print("Iteration obs called")
    if (is.null(input$iteration))
      return()
    values$iteration <- input$iteration
    
  })
  
  changeMix <- observe({
    print("mix changed")
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
  
  # returns a smaller part of the original dataframe of results
  createSubFrame <- function(scenario){
    print("createSubFrame")
    isolate({
      print(values$iteration[[1]])
      if (values$mix == FALSE){
        sub <- subset(values$subtables[[input$case]][[scenario]][[input$phase]], MetricName==input$metric,
                      select=c(Tool, MetricValue, Size, CaseName, Iteration))
        if (values$iteration[[1]] > 0){
          # summarise the metricvalue according to the given iteration values
          first <- TRUE
          for(iter in values$iteration[[1]]:values$iteration[[2]]){
            sub <- subset(values$subtables[[input$case]][[scenario]][[input$phase]], 
                          Iteration==iter & MetricName==input$metric,
                          select=c(Tool, MetricValue, Size, CaseName, Iteration))
            if(first == TRUE){
              merged <- sub
              first <- FALSE
            }
            else
              merged <- rbind(merged,sub)
          }
          if (input$xdimension != "Size"){
            merged <- subset(merged, Size == input$size)
            sub <- ddply(merged, c("Tool", "Size", "CaseName", "Iteration"),summarise,
                         MetricValue=sum(MetricValue))
          }
          else{
            sub <- ddply(merged, c("Tool", "Size", "CaseName"),summarise,
                         MetricValue=sum(MetricValue))
          }
          return(sub)
        }
      }
      else if(values$mix == TRUE){
        #
        sub <- subset(values$results, Scenario == scenario & CaseName == input$case & 
                        MetricName == input$metric, select=c(Tool, MetricValue, Size, PhaseName, 
                                                             CaseName))
        first <- TRUE
        print(input$mixphase)
        if (length(input$mixphase) == 0)
          return()
        
        # creates selection operations on sub frame based on the various phases, then merge them back
        for(phase in input$mixphase){
          if (first == TRUE){
            merged <- subset(sub, PhaseName == phase) # selection on phase
            first <- FALSE
          }
          else
            merged <- rbind(merged, subset(sub, PhaseName == phase)) # merge back
        }
        sub <- ddply(merged, c("Tool", "Size", "CaseName"), summarise,
                     MetricValue = sum(MetricValue))
      }
    })
    return(sub)
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
  
  output$case <- renderUI({
    if("CaseName" %in% values$selections == FALSE){
      # display nothing
      return()
    }
    
    case_list <- list()
    for(case in values$unique_cases){
      case_list <- c(case, case, case_list)
    }
    selectInput("case", "Case",
                choices = case_list,
                selected = case_list[0]
    )
  })

  output$tool <- renderUI({
    if("Tool" %in% values$selections == FALSE){
      # display nothing
      return()
    }
    
    isolate({
      if("CaseName" %in% values$selections){
        tool <- names(values$subtable[[input$case]])
      }
      
    })
    
    
    
    if (is.null(input$case) | is.null(input$group)){
      return()
    }
    if (input$group == "Tool"){
      return();
    }
    else{
      unique_tools <- unique(values$results$Tool)
      tools_list <- list()
      for(tool in unique_tools){
        tools_list <- c(tool, tool, tools_list)
      }
      selectInput("tool", "Tool",
                  choices = tools_list,
                  selected = tools_list[0])
    }
    
    
  })

  output$scenario <- renderUI({
    if (is.null(input$case))
      return()
    unique_scenarios <- names(values$subtables[[input$case]])
    if(length(unique_scenarios) == 0)
      return()
    scenario_list <- list()
    for(scen in unique_scenarios){
      scenario_list <- c(scen, scen, scenario_list)
    }
    selectInput("scenario", "Scenarios",
                choices = scenario_list,
                selected = scenario_list[0]
                )
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
  
  output$size <- renderUI({
    if (is.null(input$phase) | is.null(input$case) | is.null(input$scenario)){
      return()
    }
    input$xdimension
    isolate({
      if (input$xdimension == "Iteration"){
        unique_sizes <- unique(values$subtables[[input$case]][[input$scenario]][[input$phase]]$Size)
        sizeList <- c()
        if (length(unique_sizes) == 0){
          return()
        }
        for(size in unique_sizes){
          sizeList <- c(size, size, sizeList)
        }
        sizeList <- sort(sizeList, decreasing=FALSE)
        return(selectInput("size", "Size",
                    choices = sizeList,
                    selected = sizeList[0])
               )
      }
      return()
    })
    
    
  })
  
  output$metric <- renderUI({
    print("metric called")
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
    print("Iteration called")
    # add dependencies
    input$phase
    values$mix
    if (is.null(input$metric))
      return()
    
    isolate({
      values$iteration <- c(1,1)
      print(values$iteration)
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
          print("delete iteration")
          values$iteration <- c(0,0) # set to default
          return() # to remove slider
        }
      }
    })
  })

#####    DIMENSIONS PANEL    #####
  output$mix <- renderUI({
    print("mix called")
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
