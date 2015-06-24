validate <- function(results, config){
  header = names(results)
  for(row in 1:nrow(config$Plot)){
    parameterExists(config$Plot[row, ], "Metric_Scale")
    metric_scale <- config$Plot[row, ]$Metric_Scale
    if (!is.numeric(metric_scale)){
      cat("Incorrect parameter was given: Metric-Scale parameter is not numeric.\n")
      quit()
    }
    
    parameterExists(config$Plot[row, ], "Min_Iteration")
    minIter <- config$Plot[row, ]$Min_Iteration
    if (!is.numeric(minIter) & !is.na(minIter)){
      cat("Incorrect parameter was given: Min_Iteration parameter is not numeric or null.\n")
      quit()
    }
    
    parameterExists(config$Plot[row, ], "Max_Iteration")
    maxIter <- config$Plot[row, ]$Max_Iteration
    if (!is.numeric(maxIter) & !is.na(maxIter)){
      cat("Incorrect parameter was given: Max_Iteration parameter is not numeric or null.\n")
      quit()
    }
    
    parameterExists(config$Plot[row, ], "Legend")
    legend <- config$Plot[row, ]$Legend
    if (legend %in% header == FALSE){
      cat("Invalid legend name was given: <", legend,">.\nThe possible choices are the following:")
      cat(header, "\n")
      quit()
    }
    
    parameterExists(config$Plot[row, ], "X_Dimension")
    dimension <- config$Plot[row, ]$X_Dimension
    if (dimension %in% header == FALSE){
      cat("Invalid x-dimension was given: <", dimension, ">. \nThe possible choices are the following:")
      cat(header, "\n")
      quit()
    }
    
    parameterExists(config$Plot[row, ], "Summarize_Function")
    phases <- config$Plot[row, ]$Summarize_Function
    if (validPhase(results, phases) == FALSE){
      cat("Non existing phasename was given! \nThe available phasenames are the following: ")
      print(levels(results$PhaseName))
      quit()  
    }
    
    parameterExists(config$Plot[row, ], "Metrics")
    metrics <- config$Plot[row, ]$Metrics
    if (validMetric(results, metrics) == FALSE){
      cat("Non existing metricname was given!\nThe available metrics are the following: ")
      print(levels(results$MetricName))
      quit()
    }
    
    parameterExists(config$Plot[row, ], "X_Axis_Scale")
    xScale <- config$Plot[row, ]$X_Axis_Scale
    parameterExists(config$Plot[row, ], "Y_Axis_Scale")
    yScale <- config$Plot[row, ]$Y_Axis_Scale
    choices <- c("con", "log2", "factor")
    if (xScale %in% choices == FALSE){
      cat("Invalid type of scale was given: <", xScale, "> \nThe available choices are the following: ")
      cat(choices, "\n")
      quit()
    }
    if (yScale %in% choices == FALSE){
      cat("Invalid type of scale was given: <", yScale, "> \nThe available choices are the following: ")
      cat(choices, "\n")
      quit()
    }
  }
}


parameterExists <- function(config, param){
  if (param %in% names(config) == F){
    cat(param, " is not given, please adjust the configuration file!\n")
    quit()
  }
}


validMetric <- function(results, metrics){
  for(m in unlist(metrics)){
    if (m %in% unique(results$MetricName) == FALSE){
      return(FALSE)
    }
  }
  return(TRUE)
}


validPhase <- function(results, phases){
  uniquePhases <- unique(results$PhaseName)
  for(phase in unlist(phases)){
    if(phase %in% uniquePhases == FALSE){
      return(FALSE)
    }
  }
  return(TRUE)
}