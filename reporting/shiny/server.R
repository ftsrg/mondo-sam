library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("shiny", quietly=T, verbose=F, warn.conflicts=FALSE)
library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("R.oo", quietly=T, verbose=F, warn.conflicts=FALSE)

options(warn = -1)
source("filters/FilterContainer.R", echo = FALSE)
source("results/Result.R", echo = FALSE)
source("results/Publisher.R", echo = FALSE)
source("filters/Selections.R", echo = FALSE)
source("filters/DataFilter.R", echo = FALSE)
source("filters/ScenarioFilter.R", echo = FALSE)
source("filters/ToolFilter.R", echo = FALSE)
source("filters/CaseFilter.R", echo = FALSE)
source("filters/SizeFilter.R", echo = FALSE)
source("filters/PhaseFilter.R", echo = FALSE)
source("filters/MetricFilter.R", echo = FALSE)
source("filters/IterationFilter.R", echo = FALSE)
source("filters/XDimensionFilter.R", echo = FALSE)
source("filters/LegendFilter.R", echo = FALSE)
source("filters/SpecificLegendFilter.R", echo = FALSE)
source("filters/PublishingFilter.R", echo = FALSE)
source("plots/PlotContainer.R", echo = FALSE)
source("plots/PlotSettings.R", echo = FALSE)
source("plots/Theme.R", echo = FALSE)
source("serializers/ConfigurationSerializer.R", echo = FALSE)
source("options.R", echo = FALSE)
options(warn = 0)


shinyServer(function(input, output, session) {
    
  values <- reactiveValues(
                           result = Result(),
                           plotContainer = PlotContainer(),
                           filterContainer = FilterContainer(),
                           serializer = ConfigurationSerializer(),
                           publisher = Publisher(),
                           templates = list(CaseName = "CaseName", 
                                            Scenario = "Scenario", 
                                            Tool = "Tool",
                                            Size = "Size"),
                           scenarioObserver = 0, 
                           toolObserver = 0, 
                           caseObserver = 0, 
                           sizeObserver = 0, 
                           phaseObserver = 0, 
                           metricObserver = 0,
                           iterationObserver = 0,
                           xDimensionObserver = 0,
                           legendObserver = 0,
                           specificLegendObserver = 0,
                           publishingObserver = 0
                          )
  
  
# load results and make reactiv values
  output$load <- renderUI({
    inFile <- input$file
    
    if (is.null(inFile))
      return()
    isolate({
      tempResults <- read.csv(inFile$datapath, header = TRUE, sep = input$sep, 
                                 quote = input$quote)
      withProgress(message = 'Processing', value = 1.0, {
        values$result$setFrame(tempResults)
        values$result$createSubFrames()
        
        initialize()
        
        updateSelectInput(session, "theme", selected = values$plotContainer$.theme$.style)
        updateTabsetPanel(session, "reporting", selected = "Results")
        values$filterContainer$notifyFilters(values)
      })
    })
  })
  

  # initialize components
  initialize <- function () {
    values$filterContainer$setResult(values$result)
    values$filterContainer$init()
    
    values$plotContainer$.plotSettings$init(input, values$filterContainer)
    values$plotContainer$.theme$init()
  }

   
  source('observers/filters.R', local = TRUE)

  source('observers/plotsettings.R', local = TRUE)

  source('observers/theme.R', local = TRUE)

  source('observers/publishing.R', local = TRUE)

  source('pages/results_page.R', local = TRUE)

  source('pages/dimensions_page.R', local = TRUE) 

  source('pages/plot_settings_page.R', local = TRUE)

  source('pages/themes_page.R', local = TRUE)

  source('pages/publishing_page.R', local = TRUE) 
  
})
