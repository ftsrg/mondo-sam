library("R.oo", , quietly = TRUE)


setConstructorS3(name = "MetricFilter", function(selections = NULL){
  extend(DataFilter(selections), "MetricFilter")
})


setMethodS3(name = "notify", class = "MetricFilter", overwrite = TRUE, function(this, observers){
  #   this$.container$.tool$update()
  #   observers$toolObserver <- observers$toolObserver +1
  #   this$.container$.tool$notify(observers)
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
  }
  
  if (this$enable("Size")){
    uniqueStates <- unique(subset(frame, Size == this$.container$.size$.selectedState 
                                  & PhaseName %in% this$.container$.phase$.selectedState)$MetricName)
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
    for (state in prevStates){
      if (state %in% this$.allCurrentStates){
        this$.selectedState <- c(state, this$.selectedState)
      }
    }
  }
#     if(this$.selectedState %in% this$.allCurrentStates == FALSE){
#       this$.selectedState <- NULL
#     }
  this$.prevState <- this$.selectedState
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
