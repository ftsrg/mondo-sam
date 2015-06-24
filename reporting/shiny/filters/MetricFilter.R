library("R.oo", , quietly = TRUE)


setConstructorS3(name = "MetricFilter", function(selections = NULL){
  extend(DataFilter(selections), "MetricFilter")
})


setMethodS3(name = "notify", class = "MetricFilter", overwrite = TRUE, function(this, observers){
    this$.container$.iteration$update()
    observers$iterationObserver <- observers$iterationObserver + 1
    this$.container$.iteration$notify(observers)
    
    this$.container$.specificLegend$update()
    observers$specificLegendObserver <- observers$specificLegendObserver + 1
    this$.container$.specificLegend$notify(observers)
})


setMethodS3(name = "getIdentifier", class = "MetricFilter", overwrite = TRUE, function(this){
  return("MetricName")
})


setMethodS3(name = "update", class = "MetricFilter", overwrite = TRUE, function(this){
  result <- this$.container$.result
  id <- this$.container$getFrameID()
  frame <- result$getSubFrame(id)
  
  if (is.null(this$.container$.phase$.selectedState)){
    this$.allCurrentStates <- NULL
    this$.selectedState <- NULL
    return()
  }
  
  if (this$enable("Size")){
    uniqueStates <- unique(subset(frame, Size == this$.container$.size$.selectedState & 
                                  PhaseName %in% this$.container$.phase$.selectedState)$MetricName)
  }
  else {
    uniqueStates <- unique(subset(frame, PhaseName %in% this$.container$.phase$.selectedState)$MetricName)
  }
  
  this$.allCurrentStates <- list()
  for(state in uniqueStates){
    this$.allCurrentStates <- c(state, this$.allCurrentStates)
  }
  if (!is.null(this$.selectedState)){
    prevStates <- this$.selectedState
    this$.selectedState <- c()
    for (state in prevStates){
      if (state %in% this$.allCurrentStates){
        this$.selectedState <- c(state, this$.selectedState)
      }
    }
  }
  else if (length(this$.allCurrentStates) == 1){
    this$.selectedState <- this$.allCurrentStates[1]
  }
})


setMethodS3(name = "display", class = "MetricFilter", overwrite = TRUE, function(this){
  if (is.null(this$.container$.phase$.selectedState)){
    return()
  }
  selectizeInput("metrics", "Metrics",
                 choices = this$.allCurrentStates,
                 multiple = TRUE,
                 selected = this$.selectedState)
  
})
