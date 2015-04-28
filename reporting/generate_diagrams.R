library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr", quietly=T, verbose=F, warn.conflicts=FALSE)
source("plot_functions.R")
source("plot.R")
source("theme.R")
source("util.R")
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
  
if (file.exists(diagramsPath) == FALSE){
  dir.create(diagramsPath)
}

for(row in 1:nrow(config$Plot)){
  selections <- defaultSelections
  phases <- config$Plot[row, ]$Summarize_Function
  x_dimension <- config$Plot[row, ]$X_Dimension
  legend <- config$Plot[row, ]$Legend
  metrics <- config$Plot[row, ]$Metrics
  
  subData <- subset(results, MetricName %in% c(unlist(metrics)))
  # scale down or up
  subData$MetricValue <- subData$MetricValue * (10** config$Plot[row, ]$Metric_Scale)
  
  # filter by iteration
  iterations <- unique(subData$Iteration)
  if (config$Plot[row, ]$Max_Iteration < 0){
    maxIter <- max(iterations)
  }
  else{
    maxIter <- config$Plot[row, ]$Max_Iteration
  }
  minIter <- config$Plot[row, ]$Min_Iteration
  
  subData <- subset(subData, Iteration >= minIter & Iteration <= maxIter)
  selections <- selections[selections != legend & selections != x_dimension]
  
  filename <- paste(diagramsPath, "Plot", sep="")
  report(subData, selections, config, row, filename)
}