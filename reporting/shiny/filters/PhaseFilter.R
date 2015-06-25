library("R.oo", , quietly = TRUE)


setConstructorS3(name = "PhaseFilter", function(selections = NULL){
  extend(DataFilter(selections), "PhaseFilter")
})


setMethodS3(name = "updateNext", class = "PhaseFilter", abstract = TRUE, function(this){
  this$.container$.metric$update()
  this$.container$.metric$updateNext()
})


setMethodS3(name = "notifyView", class = "PhaseFilter", overwrite = TRUE, function(this, observers){
  observers$phaseObserver <- observers$phaseObserver + 1
})


setMethodS3(name = "notifyNextView", class = "PhaseFilter", overwrite = TRUE, function(this, observers){
  this$.container$.metric$notifyView(observers)
  this$.container$.metric$notifyNextView(observers)
})


setMethodS3(name = "getIdentifier", class = "PhaseFilter", overwrite = TRUE, function(this){
  return("PhaseName")
})


setMethodS3(name = "update", class = "PhaseFilter", overwrite = TRUE, function(this){
  result <- this$.container$.result
  id <- this$.container$getFrameID()
  frame <- result$getSubFrame(id)
  
  if (this$enable("Size")){
    uniqueStates <- unique(subset(frame, Size == this$.container$.size$.selectedState)$PhaseName)
  }
  else{
    uniqueStates <- unique(frame$PhaseName)
  }
  
  this$.allCurrentStates <- c()
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


setMethodS3(name = "display", class = "PhaseFilter", overwrite = TRUE, function(this){
  selectizeInput("phases", "Phases",
                 choices = this$.allCurrentStates,
                 multiple = TRUE,
                 selected = this$.selectedState)
  
})
