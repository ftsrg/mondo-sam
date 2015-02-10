library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library(shiny)
source("functions.R")
source("plot.R")

results <- load("../../results/results.csv")
subtables <- preprocess(results)

iteration <- c(0,0)

shinyServer(function(input, output) {
    
  output$plot <- renderPlot({
    if (is.null(input$metric) | is.null(input$phase))
      return()
    if (input$mix == FALSE){
      sub <- subset(subtables[[input$scenario]][[input$phase]], MetricName==input$metric,
                    select=c(Tool, MetricValue, Size))
      if (!is.null(input$iteration))
        if (iteration[1] > 0){
          first <- TRUE
          for(iter in iteration[1]:iteration[2]){
            sub <- subset(subtables[[input$scenario]][[input$phase]], Iteration==iter & MetricName==input$metric,
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
      sub <- subset(results, Scenario == input$scenario & CaseName == input$case & 
                      MetricName == input$metric, select=c(Tool, MetricValue, Size, PhaseName))
      first <- TRUE
      if (length(input$mixphase) == 0)
        return()
      for(phase in input$mixphase){
        if (first == TRUE){
          merged <- subset(sub, PhaseName == phase)
          first <- FALSE
        }
        else
          merged <- rbind(merged, subset(sub, PhaseName == phase))
      }
      sub <- ddply(merged, c("Tool", "Size"), summarise,
                      MetricValue = sum(MetricValue))
    }

    
    settings <- PlotSettings()
    settings <- setLabels(settings, input$xlabel, input$ylabel)
    settings <- setTitle(settings, input$title)
    settings <- setAxis(settings, input$xaxis, input$yaxis)
    plot <- createPlot(sub, settings)
    print(plot)
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
  
  output$mix <- renderUI({
    if (is.null(input$scenario)){
      return()
    }
    checkboxInput("mix", label = "Mix", value = FALSE)
    
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
    if (is.null(input$metric))
      return()
    iteration <<- input$iteration # used globally
    if (input$mix == FALSE){
      max_value <- max(subset(subtables[[input$scenario]][[input$phase]], MetricName == input$metric)$Iteration)
      if(max_value > 1){
        if(is.null(iteration)) # first initialization
          iteration <<- c(1,1) # used globally
        sliderInput("iteration", "Iterations",
                    min=1,
                    max=max_value,
                    value=c(iteration[1], iteration[2]),
                    step=1
        )
      }
      else if (is.null(input$iteration) == FALSE){
        iteration <<- c(0,0)
        return() # to remove slider
      }
    }
  })
  
  output$axis <- renderUI({
    
    
    
  })
  
})
