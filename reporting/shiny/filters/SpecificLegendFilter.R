library("R.oo", , quietly = TRUE)


setConstructorS3(name = "SpecificLegendFilter", function(selections = NULL){
  extend(DataFilter(selections), "SpecificLegendFilter",
         .selectAll = TRUE)
})


setMethodS3(name = "updateNext", class = "SpecificLegendFilter", abstract = TRUE, function(this){
  # empty
})


setMethodS3(name = "notifyView", class = "SpecificLegendFilter", overwrite = TRUE, function(this, observers){
  observers$specificLegendObserver <- observers$specificLegendObserver + 1
})


setMethodS3(name = "notifyNextView", class = "SpecificLegendFilter", overwrite = TRUE, function(this, observers){
  # empty
})


setMethodS3(name = "update", class = "SpecificLegendFilter", overwrite = TRUE, function(this){
  if (is.null(this$.container$.metric$.selectedState)){
    this$.selectedState <- NULL
    this$.allCurrentStates <- NULL
    return()
  }
  
  result <- this$.container$.result
  id <- this$.container$getFrameID()
  frame <- result$getSubFrame(id)
  
  if (this$enable("Size")){
    uniqueStates <- unique(subset(frame, Size == this$.container$.size$.selectedState & 
                                  PhaseName %in% this$.container$.phase$.selectedState & 
                                  MetricName %in% this$.container$.metric$.selectedState)[[this$.container$.legend$.selectedState]])
  }
  else {
    uniqueStates <- unique(subset(frame, PhaseName %in% this$.container$.phase$.selectedState & 
                                  MetricName %in% this$.container$.metric$.selectedState)[[this$.container$.legend$.selectedState]])
  }
  
  if (length(uniqueStates) == 0){
    this$.selectedState <- NULL
    this$.allCurrentStates <- NULL
    return()
  }
  
  this$.allCurrentStates <- c()
  for(state in uniqueStates){
    this$.allCurrentStates <- c(state, this$.allCurrentStates)
  }
  
  if (this$.selectAll){
    this$.selectedState <- this$.allCurrentStates
  }
  else if (!is.null(this$.selectedState)){
    prevStates <- this$.selectedState
    this$.selectedState <- c()
    for (state in prevStates){
      if (state %in% this$.allCurrentStates){
        this$.selectedState <- c(state, this$.selectedState)
      }
    }
  }
  
  # if it is still empty
  if (is.null(this$.selectedState)){
    this$.selectedState <- this$.allCurrentStates
  }
})

  
setMethodS3(name = "display", class = "SpecificLegendFilter", overwrite = TRUE, function(this){
  if (is.null(this$.allCurrentStates)){
    return()
  }
  
  checkboxGroupInput("legendFilters",label="Legend Filters",
                     choices=this$.allCurrentStates, selected=this$.selectedState)
})
