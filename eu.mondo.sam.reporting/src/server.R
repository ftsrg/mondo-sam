library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library(shiny)
source("functions.R")

# results <- read.csv("../../results/results.csv", head=TRUE, sep=",")
results <- load("../../results/results.csv")
# unique_scenarios <- unique(subset(results, CaseName == "ProtoCase")$Scenario)
# 
# subtables <- vector(mode="list", length=length(unique_scenarios))
# names(subtables) <- (unique_scenarios)
subtables <- preprocess()


# first <- TRUE
# for(scen in unique_scenarios){
#   tools <- unique(subset(results, Scenario==scen)$Tool)
#   for(tool in tools){
#     sizes <- unique(subset(results,Scenario==scen & Tool==tool)$Size)
#     for(size in sizes){
#       phases <- unique(subset(results,Scenario==scen & Tool==tool & Size==size)$PhaseName)
#       for(phase in phases){
#         metrics <- unique(subset(results, Scenario== scen & Tool==tool & 
#                                    Size==size & PhaseName==phase)$MetricName)
#         for(metric in metrics){
#           sub <- subset(results, Scenario==scen & Tool==tool & Size==size &
#                           PhaseName==phase & MetricName==metric)
#           sub$Iteration <-seq_len(nrow(sub))
#           if(first == TRUE){
#             merged <- sub
#             first <- FALSE
#           }
#           else
#             merged <- rbind(merged, sub)
#         }
#       }
#     }
#   }
# }
# 
# 
# 
# for(scen in unique_scenarios){
#   unique_phases <- unique(subset(merged, CaseName == "ProtoCase" & Scenario == scen)$PhaseName)
#   subtables[[scen]] <- vector(mode="list", length=length(unique_phases))
#   names(subtables[[scen]]) <- unique_phases
#   for(phase in unique_phases){
#     subtables[[scen]][[phase]] <- subset(merged, Scenario==scen & PhaseName==phase)
#    tools <- unique(subtables[[scen]][[phase]]$Tool)
#    for(t in tools){
#      for(s in unique(subset(subtables[[scen]][[phase]], Tool==t)$Size)){
#        unique_metrics <- unique(subset(subtables[[scen]][[phase]], Tool==t && Size==s)$MetricName)
#        for(m in unique_metrics){
#          subtables[[scen]][[phase]]$Iteration <- seq_len(nrow(subset(subtables[[scen]][[phase]], 
#                                                                      Tool==t & Size==s & MetricName==m)))
#        }
#      }
#    }
#   }
# }

#print(subtables[["scenario2"]][["Multiple"]])

shinyServer(function(input, output) {
    
  output$plot <- renderPlot({
    if (is.null(input$metric))
      return()
    
    sub <- subset(subtables[[input$scenario]][[input$phase]], MetricName==input$metric)
    
    if (is.null(input$iteration) == FALSE){
      if(input$iteration[2] != 1){
      tools <- unique(subtables[[input$scenario]][[input$phase]]$Tool)
#       for(tool in tools){
#         for(size in unique(subset(subtables[[input$scenario]][[input$phase]], Tool==tool)$Size)){
#           unique_metrics <- unique(subset(subtables[[input$scenario]][[input$phase]], Tool==tool & Size==size)$MetricName)
#           for(metric in unique_metrics){
#             subtables[[input$scenario]][[input$phase]]$Iteration <- seq_len(nrow(subset(subtables[[input$scenario]][[input$phase]], 
#                                                                                         Tool==tool & Size==size & MetricName==metric)))
#           }
#         }
#       }    
    }
      
      #print(subtables[[input$scenario]][[input$phase]])
      first <- TRUE
      #merged <- subset(subtables[[input$scenario]][[input$phase]], Iteration==input$iteration[1] & 
      #                   MetricName==input$metric)
      for(iter in input$iteration[1]:input$iteration[2]){
        print(iter)
        sub <- subset(subtables[[input$scenario]][[input$phase]], Iteration==iter & MetricName==input$metric)
        if(first == TRUE){
          merged <- sub
          first <- FALSE
        }
        else
          merged <- rbind(merged,sub)
      }
      print(merged)
      sub <- ddply(merged, c("Tool", "Size"),summarise,
                      MetricValue=sum(MetricValue))
      print(sub)
    }
    
    plot <- ggplot(sub, aes(x=Size, y=MetricValue)) +
      geom_line(aes(group=Tool, colour=Tool)) +
      geom_point(aes(shape=Tool, colour=Tool))
    print(plot)
  })
  
  output$scenario <- renderUI({
    if (is.null(input$case))
      return()
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
    unique_phases <- names(subtables[[input$scenario]])
    if(length(unique_phases) == 0){
      return()
    }
    selectInput("phase", "Phases",
                choices = unique_phases
    )
  })
  
  output$metric <- renderUI({
    if (is.null(input$phase))
      return()
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
  })
  
  output$iteration <- renderUI({
    if (is.null(input$metric)){
      return()
    }
    max_value <- max(subset(subtables[[input$scenario]][[input$phase]], MetricName == input$metric)$Iteration)
    if(max_value > 1){
      sliderInput("iteration", "Iterations",
                  min=1,
                  max=max_value,
                  value=c(1,1),
                  step=1
                  )
    }    
  })
  
})
