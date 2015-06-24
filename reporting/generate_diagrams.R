library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr", quietly=T, verbose=F, warn.conflicts=FALSE)
library("R.oo", quietly=T, verbose=F, warn.conflicts=FALSE)
source("util.R")
options(warn = -1)
source("constants.R")
source("validation.R")
source("shiny/filters/FilterContainer.R", echo = FALSE)
source("shiny/results/Result.R", echo = FALSE)
source("shiny/results/Publisher.R", echo = FALSE)
source("shiny/filters/Selections.R", echo = FALSE)
source("shiny/filters/DataFilter.R", echo = FALSE)
source("shiny/filters/ScenarioFilter.R", echo = FALSE)
source("shiny/filters/ToolFilter.R", echo = FALSE)
source("shiny/filters/CaseFilter.R", echo = FALSE)
source("shiny/filters/SizeFilter.R", echo = FALSE)
source("shiny/filters/PhaseFilter.R", echo = FALSE)
source("shiny/filters/MetricFilter.R", echo = FALSE)
source("shiny/filters/IterationFilter.R", echo = FALSE)
source("shiny/filters/XDimensionFilter.R", echo = FALSE)
source("shiny/filters/LegendFilter.R", echo = FALSE)
source("shiny/filters/SpecificLegendFilter.R", echo = FALSE)
source("shiny/filters/PublishingFilter.R", echo = FALSE)
source("shiny/plots/PlotContainer.R", echo = FALSE)
source("shiny/plots/PlotSettings.R", echo = FALSE)
source("shiny/plots/Theme.R", echo = FALSE)
source("shiny/serializers/ConfigurationSerializer.R", echo = FALSE)
options(warn = 1)

args <- commandArgs(trailingOnly = TRUE)
if(!is.na(args[1])){
  resultsPath <- args[1]
}
if(!is.na(args[2])){
  diagramsPath <- args[2]
}
if(!is.na(args[3])){
  configPath <- args[3]
}
# else: use the default paths
data <-read.csv(resultsPath, header=TRUE, sep=',')

config <- fromJSON(configPath)

# validation
validate(data, config)
  
if (file.exists(diagramsPath) == FALSE){
  dir.create(diagramsPath)
}


result <- Result()
plotContainer <- PlotContainer()
filterContainer <- FilterContainer()
publisher <- Publisher()
serializer <- ConfigurationSerializer

publisher$.location <- diagramsPath

for(row in 1:nrow(config$Plot)){
  result$setFrame(data)
  
  legend <- config$Plot[row, ]$Legend
  specLegends <- unlist(config$Plot[row, ]$Legend_Filters)
  if (is.list(specLegends)){
    specLegends <- unlist(specLegends)
  }
  if (!is.na(specLegends)){
    result$.frame <- result$.frame[which(result$.frame[[legend]] %in% specLegends), ]
  }

  metrics <- config$Plot[row, ]$Metrics
  if (is.list(metrics)){
    metrics <- unlist(metrics)
  }
  
  phases <- config$Plot[row, ]$Summarize_Function
  if (is.list(phases)){
    phases <- unlist(phases)
  }
  result$.frame <- subset(result$.frame, MetricName %in% metrics & 
                            PhaseName %in% phases)

  result$createSubFrames()
  
  filterContainer$setResult(result)
  filterContainer$init()
  
  plotContainer$.plotSettings$init(filterContainer)
  plotContainer$.theme$init()
  
  serializer$.filterContainer <- filterContainer
  serializer$.plotContainer <- plotContainer
  serializer$.publisher <- publisher
  
  serializer$import(config$Plot[row, ])
  
  filterContainer$.selections$changeSelections(filterContainer$.legend$.selectedState, filterContainer$.xDimension$.selectedState)
  
  filterContainer$.scenario$update()
  filterContainer$.tool$update()
  filterContainer$.case$update()
  filterContainer$.size$update()
  filterContainer$.iteration$update()
  
  publisher$publish(filterContainer, plotContainer, filterContainer$.selections$.selections, verbose = TRUE)

}