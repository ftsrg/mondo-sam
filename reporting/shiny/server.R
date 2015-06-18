library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("shiny", quietly=T, verbose=F, warn.conflicts=FALSE)
library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("R.oo", quietly=T, verbose=F, warn.conflicts=FALSE)
source("../plot.R")
source("../plot_functions.R")
source("../theme.R")
source("../util.R")
# source("../constants.R")
options(warn=-1)
source("classes/FilterContainer.R", echo = FALSE)
source("classes/Result.R", echo = FALSE)
source("classes/Selections.R", echo = FALSE)
source("classes/DataFilter.R", echo = FALSE)
source("classes/ToolFilter.R", echo = FALSE)
source("classes/ScenarioFilter.R", echo = FALSE)
options(warn=0)

shinyServer(function(input, output, session) {
    
  
  
  values <- reactiveValues(
                           result = Result(),
                           filterContainer = FilterContainer(),
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
                           scenarioObserver=0, 
                           toolObserver=0, 
                           caseObserver=0, 
                           sizeObserver=0, 
                           phaseObserver=0, 
                           metricObserver=0,
                           iterationObserver=0,
                           scenario = "",
                           case = "",
                           tool = "",
                           size = "",
                           phases = "",
                           metrics = "",
                           legendFilters = c(),
                           iterations = c(0,0),
                           xDimension = "Size",
                           selectedLegend = "MetricName",
                           settings = PlotSettings(theme="Default")
                          )
  
  
  
  
# load results and make reactiv values
  output$load <- renderUI({
    inFile <- input$file
    
    if (is.null(inFile))
      return()
    isolate({
      tempResults <- read.csv(inFile$datapath, header=TRUE, sep=input$sep, 
                                 quote=input$quote)
      withProgress(message = 'Processing', value = 1.0, {
#         values$unique_cases <- as.character(unique(values$results$CaseName))
#         values$unique_tools <- as.character(unique(values$results$Tool))
#         values$unique_sizes <- as.character(unique(values$results$Size))
#         values$unique_scenarios <- as.character(unique(values$results$Scenario))
#         s <- proc.time()
        values$result$setFrame(tempResults)
        values$result$createSubFrames()
#         t <- proc.time()
#         elapsed <- t-s
#         print(elapsed)
        
        # initialize components
        values$filterContainer$setResult(values$result)
        values$filterContainer$init()

        updateTabsetPanel(session, "reporting", selected = "Results")
#         print(values$subFrames[["ID.Batch.EMFIncQuery.PosLength"]])
#         print(names(values$subFrames))
      })
    })
  })
  
  # observer for plot specific adjustments like title, labels, scales and the like
  changeSettings <- observe({
    # add dependency
#     if (is.null(input$visualize)){
#       return()
#     }
#     
#     isolate({
#       if (is.null(input$case))
#         return()
#       if (is.null(input$phase))
#         return()
#       if (is.null(input$scenario))
#         return()
#       if (is.null(input$metric))
#         return()
# #       if (is.null(input$mix))
# #         return()
#       if (is.null(input$xaxis) | is.null(input$yaxis)){
#         values$settings <- setAxis(values$settings, "Continuous", "Continuous")
#       }
#       if (is.null(input$theme)){
#         values$settings <- setTheme(values$settings, "Default")
#       }
#       if (input$xlabel == ""){
#         xLabel <- input$xdimension
#       }
#       else{
#         xLabel <- input$xlabel
#       }
#       if (input$ylabel == ""){
#         yLabel <- input$metric
#       }
#       else{
#         yLabel <- input$ylabel
#       }
#       values$settings <- setLabels(values$settings, xLabel, yLabel)
#       
#       title <- isolate(input$title)
#       title <- gsub("CASENAME", input$case, title)
#       if (values$mix == TRUE){
#         phases <- ""
#         for(p in input$mixphase)
#           phases  <- paste(phases, p, sep=' ')
#         title <- gsub("PHASENAME", phases, title)
#       }
#       title <- gsub("PHASENAME", input$phase, title)
#       title <- gsub("METRICNAME", input$metric, title)
#       title <- gsub("SCENARIO", input$scenario, title)
#       values$settings <- setTitle(values$settings, title)
#       
#       values$settings <- setAxis(values$settings, input$xaxis, input$yaxis)
#       values$settings <- setTheme(values$settings, input$theme)
#       values$settings <- setYScale(values$settings, input$yscale)
#       values$settings <- showValues(values$settings, input$showValues)
#     })
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
      file <- gsub("METRICNAME", input$metrics, file)
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
  
  source('observers.R', local=TRUE)


source('pages/results_page.R', local=TRUE)

source('pages/dimensions_page.R', local=TRUE) 

source('pages/plot_settings_page.R', local=TRUE)

source('pages/publishing_page.R', local=TRUE) 
  
})
