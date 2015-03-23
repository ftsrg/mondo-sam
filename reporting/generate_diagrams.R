library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr", quietly=T, verbose=F, warn.conflicts=FALSE)
source("functions.R")
source("plot.R")
source("constants.R")
source("validation.R")

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
results <-read.csv(resultsPath, header=TRUE, sep=',')

config <- fromJSON(configPath)

# validation
validate(results, config)
  
index <- 0
settings <- PlotSettings()
uniqueScenarios <- unique(results$Scenario)
createFolders(diagramsPath, uniqueScenarios)


for(row in 1:nrow(config$Plot)){
  selections <- defaultSelections
  phases <- config$Plot[row, ]$Summarize_Function
  x_dimension <- config$Plot[row, ]$X_Dimension
  legend <- config$Plot[row, ]$Legend
  metrics <- config$Plot[row, ]$Metrics
  
  subData <- subset(results, MetricName %in% c(unlist(metrics)))
  # scale down or up
  subData$MetricValue <- subData$MetricValue * (10** config$Plot[row, ]$Metric_Scale)
  
  selections <- selections[selections != legend & selections != x_dimension]
  
  filename <- paste(diagramsPath, "Plot", sep="")
  report(subData, selections, config, row, filename)
}