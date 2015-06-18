library("R.oo", , quietly = TRUE)


setConstructorS3(name = "IterationFilter", function(selections = NULL){
  extend(DataFilter(selections), "IterationFilter")
})


setMethodS3(name = "notify", class = "IterationFilter", overwrite = TRUE, function(this, observers){
})


setMethodS3(name = "getIdentifier", class = "IterationFilter", overwrite = TRUE, function(this){
  return("Iteration")
})


setMethodS3(name = "update", class = "IterationFilter", overwrite = TRUE, function(this){
  result <- this$.container$.result
  id <- this$.container$getFrameID()
  frame <- result$getSubFrame(id)
  
  if (is.null(this$.container$.metric$.selectedState)){
    this$.allCurrentStates <- NULL
    this$.selectedState <- NULL
    return()
  }
  
  if (this$enable("Size")){
    uniqueStates <- unique(subset(frame, Size == this$.container$.size$.selectedState & 
                                  PhaseName %in% this$.container$.phase$.selectedState & 
                                  MetricName %in% this$.container$.metric$.selectedState)$Iteration)
  }
  else {
    uniqueStates <- unique(subset(frame, PhaseName %in% this$.container$.phase$.selectedState & 
                                  MetricName %in% this$.container$.metric$.selectedState)$Iteration)
  }
  
  maxIteration <- max(uniqueStates)
  minIteration <- min(uniqueStates)
  
  if (maxIteration == minIteration){
    this$.allCurrentStates <- NULL
    this$.selectedState <- NULL
    return()
  }
  
  if (!is.null(this$.selectedState)){
    if (this$.selectedState[1] < minIteration || this$.selectedState[1] > maxIteration){
      this$.selectedState[1] <- minIteration
    }
    if (this$.selectedState[2] > maxIteration || this$.selectedState[2] < minIteration){
      this$.selectedState[2] <- maxIteration
    }
  }
  else {
    this$.selectedState[1] <- minIteration
    this$.selectedState[2] <- maxIteration
  }
  
  this$.allCurrentStates[1] <- minIteration
  this$.allCurrentStates[2] <- maxIteration

})


setMethodS3(name = "display", class = "IterationFilter", overwrite = TRUE, function(this){
  if (is.null(this$.container$.metric$.selectedState)){
    return()
  }
  if (is.null(this$.selectedState)){
    return()
  }
  
  sliderInput("iteration", "Iterations",
              min=this$.allCurrentStates[1],
              max=this$.allCurrentStates[2],
              value=c(this$.selectedState[1], this$.selectedState[2]),
              step=1)
})
