library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library(shiny, quietly=T, verbose=F, warn.conflicts=FALSE)
source("functions.R")
source("plot.R")

results <- load("../../results/results.csv")
subtables <- preprocess(results)

#iteration <- c(0,0)

shinyServer(function(input, output, session) {
    
  
  values <- reactiveValues(iteration = c(0,0))
  values$settings <- PlotSettings(theme="Default")
  values$results <- results
  values$subtables <- subtables
  #values$settings <- setTheme(values$settings, "Default")
  
  
  refreshSettingsTitle <- observe({
    print("refreshSettingsTitle")
    # create dependencies:case,phase,scenario,metric, mix
    if (is.null(input$mix))
      return()
    if (is.null(input$case))
      return()
    if (is.null(input$phase))
      return()
    if (is.null(input$scenario))
      return()
    if (is.null(input$metric))
      return()
    isolate({
      title <- input$title
      title <- gsub("CASENAME", input$case, title)
      if (input$mix == TRUE){
        phases <- ""
        for(p in input$mixphase)
          phases  <- paste(phases, p, sep=' ')
        title <- gsub("PHASENAME", phases, title)
      }
      title <- gsub("PHASENAME", input$phase, title)
      title <- gsub("METRICNAME", input$metric, title)
      title <- gsub("SCENARIO", input$scenario, title)
      values$settings <- setTitle(values$settings, title)
    })
  })

  changeSettings <- observe({
    print("changeSettings")
    # add dependencies
    input$xlabel
    input$ylabel
    input$xaxis
    input$yaxis
    input$theme
    input$title
    if (is.null(input$mix))
      return()
    if (is.null(isolate(input$case)))
      return()
    if (is.null(isolate(input$phase)))
      return()
    if (is.null(isolate(input$scenario)))
      return()
    if (is.null(isolate(input$metric)))
      return()
    
    isolate({
      values$settings <- setLabels(values$settings, input$xlabel, input$ylabel)
      
      title <- isolate(input$title)
      title <- gsub("CASENAME", input$case, title)
      if (input$mix == TRUE){
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
      print("Settings done")
    })
  })
  
  changeIteration <- observe({
    print("Iteration obs called")
    if (is.null(input$iteration))
      return()
    values$iteration <- input$iteration
    
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
  
  # observer for publishing
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
          print(scenario)
#           sub <- values$subtables[[scenario]][[input$phase]]
          sub <- createSubFrame(scenario)
          if (is.null(sub))
            return()
          
          if (input$mix == TRUE){
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
      if (input$mix == FALSE){
        sub <- subset(values$subtables[[scenario]][[input$phase]], MetricName==input$metric,
                      select=c(Tool, MetricValue, Size))
        #if (!is.null(input$iteration))
          if (values$iteration[[1]] > 0){
            # summarise the metricvalue according to the given iteration values
            first <- TRUE
            for(iter in values$iteration[[1]]:values$iteration[[2]]){
              sub <- subset(values$subtables[[scenario]][[input$phase]], Iteration==iter & MetricName==input$metric,
                            select=c(Tool, MetricValue, Size))
              if(first == TRUE){
                merged <- sub
                first <- FALSE
              }
              else
                merged <- rbind(merged,sub)
            }
            sub <- ddply(merged, c("Tool", "Size"),summarise,
                         MetricValue=sum(MetricValue))
          }
      }
      else if(input$mix == TRUE){
        #
        sub <- subset(values$results, Scenario == scenario & CaseName == input$case & 
                        MetricName == input$metric, select=c(Tool, MetricValue, Size, PhaseName))
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
        sub <- ddply(merged, c("Tool", "Size"), summarise,
                     MetricValue = sum(MetricValue))
      }
    })
    return(sub)
  }
  
  
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
        plot <- createPlot(sub, values$settings)
        print(plot)
      })
      #ggsave(plot=plot,filename="../../diagrams/testplot.png", width=14, height=7, dpi=192)
    })
  })
  
  output$scenario <- renderUI({
    if (is.null(input$case))
      return()
    unique_scenarios <- names(subtables)
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
    if (is.null(input$mix) == FALSE){
      if(input$mix == FALSE){
        unique_phases <- names(subtables[[input$scenario]])
        if(length(unique_phases) == 0){
          return()
        }
        selectInput("phase", "Phases",
                    choices = unique_phases,
                    selected = unique_phases[0]
        )
      }
      else if(input$mix == TRUE){
        unique_phases <- unique(subset(results, Scenario == input$scenario & MetricName == input$metric)$PhaseName)
        
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
    }
    
  })
  
  output$metric <- renderUI({
    print("metric called")
    if (is.null(input$mix)){
      return()
    }
    if (input$mix == FALSE & is.null(input$phase))
      return()
    if (input$mix == FALSE){
      unique_metrics <- unique(subtables[[input$scenario]][[input$phase]]$MetricName)
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
    else if(input$mix == TRUE){
      unique_metrics <- unique(subset(results, Scenario == input$scenario)$MetricName)
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
    input$phase
    if (is.null(input$metric))
      return()
#      if (is.null(input$iteration) == FALSE)
#        values$iteration <- input$iteration
    
    isolate({
      values$iteration <- c(1,1)
      print(values$iteration)
      if (input$mix == FALSE){
        max_value <- max(subset(subtables[[input$scenario]][[input$phase]], MetricName == input$metric)$Iteration)
        if(max_value > 1){
          #         if(values$iteration[[1]] == 0)
          #           values$iteration <- c(1,1)
          
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
  
#   output$title <- renderUI({
#     textInput("title", "Title",
#               value="SCENARIO CASENAME PHASENAME")
#   })
  
  output$titleTemplate <- renderUI({
    # TODO evaluate choices from results
    selectInput("titleTemplate", "Templates",
                choices=c("CaseName", "Scenario", "PhaseName", "MetricName"))
  })
  
  output$publishTemplate <- renderUI({
    print("publishTemplate called")
    # TODO evaluate choices from results
    selectInput("publishTemplate", "Templates",
                choices=c("CaseName", "Scenario", "PhaseName", "MetricName"))
  })
  
})
