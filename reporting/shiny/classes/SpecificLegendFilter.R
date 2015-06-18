library("R.oo", , quietly = TRUE)


setConstructorS3(name = "SpecificLegendFilter", function(selections = NULL){
  extend(DataFilter(selections), "SpecificLegendFilter")
})


setMethodS3(name = "notify", class = "SpecificLegendFilter", overwrite = TRUE, function(this, observers){
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
    uniqueStates <- unique(subset(frame, Size == this$.container$.size$.selectedState 
                                  & PhaseName %in% this$.container$.phase$.selectedState
                                  & MetricName %in% this$.container$.metric$.selectedState)[[this$.container$.legend$.selectedState]])
  }
  else {
    uniqueStates <- unique(subset(frame, PhaseName %in% this$.container$.phase$.selectedState
                                  & MetricName %in% this$.container$.metric$.selectedState)[[this$.container$.legend$.selectedState]])
  }
  
  if (length(uniqueStates) == 0){
    this$.selectedState <- NULL
    this$.allCurrentStates <- NULL
    return()
  }
  
  this$.allCurrentStates <- list()
  for(state in uniqueStates){
    this$.allCurrentStates <- c(state, this$.allCurrentStates)
  }
  this$.selectedState <- this$.allCurrentStates
})

  
setMethodS3(name = "display", class = "SpecificLegendFilter", overwrite = TRUE, function(this){
  if (is.null(this$.selectedState)){
    return()
  }
  
  checkboxGroupInput("legendFilters",label="Filters",
                     choices=this$.allCurrentStates, selected=this$.selectedState)
})
