library("R.oo", , quietly = TRUE)


setConstructorS3(name = "PhaseFilter", function(selections = NULL){
  extend(DataFilter(selections), "PhaseFilter")
})


setMethodS3(name = "notify", class = "PhaseFilter", overwrite = TRUE, function(this, observers){
  #   this$.container$.tool$update()
  #   observers$toolObserver <- observers$toolObserver +1
  #   this$.container$.tool$notify(observers)
})


setMethodS3(name = "getIdentifier", class = "PhaseFilter", overwrite = TRUE, function(this){
  return("PhaseName")
})


setMethodS3(name = "update", class = "PhaseFilter", overwrite = TRUE, function(this){
  result <- this$.container$.result
  id <- this$.container$getFrameID(this$getIdentifier())
  frame <- result$getSubFrame(id)
  
  if (this$enable("Size")){
    uniqueStates <- unique(subset(frame, Size == this$.container$.size$.currentState)$PhaseName)
  }
  else{
    uniqueStates <- unique(frame$PhaseName)
  }
  
  this$.allCurrentStates <- list()
  for(state in uniqueStates){
    this$.allCurrentStates <- c(state, this$.allCurrentStates)
  }
  if (!is.null(this$.selectedState)){
    if(this$.selectedState %in% this$.allCurrentStates == FALSE){
      this$.selectedState <- NULL
    }
  }
  this$.prevState <- this$.selectedState
})


setMethodS3(name = "display", class = "PhaseFilter", overwrite = TRUE, function(this){
  if(!this$enable("PhaseName")){
    # display nothing
    return()
  }
  selectizeInput("phases", "Phases",
                 choices = this$.allCurrentStates,
                 multiple = TRUE,
                 selected = this$.selectedState)
  
})
