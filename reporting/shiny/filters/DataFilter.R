library("R.oo", , quietly = TRUE)

#' DataFilter class
setConstructorS3(name = "DataFilter", abstract = TRUE, function(selections = NULL){
  extend(Object(), "DataFilter",
         .selections = selections,
         .container = NULL,
         .selectedState = NULL,
         .allCurrentStates = NULL,
         .allStates = NULL,
         .selectedStateStorage = NULL,
         .allCurrentStatesStorage = NULL)
})


setMethodS3(name = "getState", class = "DataFilter", function(this){
  if (is.null(this$.selectedState)){
    throw("Null state in DataFilter - getState")
  }
  this$.selectedState
})


setMethodS3(name = "setState", class = "DataFilter", function(this, state){
  if (is.null(state)){
    throw("Null value in DataFilter - setState")
  }
  this$.selectedState <- state
})


setMethodS3(name = "getAllStates", class = "DataFilter", function(this){
  if (is.null(this$.allStates)){
    throw("Null states in DataFilter - getAllStates")
  }
  this$.allStates
})


setMethodS3(name = "setAllStates", class = "DataFilter", function(this, states){
  if (is.null(states)){
    throw("Null value in DataFilter - setAllStates")
  }
  this$.allStates <- states
})


setMethodS3("name = getSelections", class = "DataFilter", function(this){
  this$.selections
})


setMethodS3(name = "setContainer", class = "DataFilter", function(this, container){
  if (is.null(container)){
    throw("Null container value in DataFilter - setContainer")
  }
  this$.container = container
})


setMethodS3(name = "enable", class = "DataFilter", function(this, filterName){
  if(filterName %in% this$.selections$getSelections() == FALSE){
    return(FALSE)
  }
  return(TRUE)
})


setMethodS3(name = "storeState", class = "DataFilter", function(this){
  this$.selectedStateStorage <- this$.selectedState
  this$.allCurrentStatesStorage <- this$.allCurrentStates
})


setMethodS3(name = "popState", class = "DataFilter", function(this){
  this$.selectedState <- this$.selectedStateStorage
  this$.allCurrentStates <- this$.allCurrentStatesStorage
})


setMethodS3(name = "notifyView", class = "DataFilter", abstract = TRUE, function(this, observers){})


setMethodS3(name = "notifyNextView", class = "DataFilter", abstract = TRUE, function(this, observers){})


setMethodS3(name = "getIdentifier", class = "DataFilter", abstract = TRUE, function(this){})


setMethodS3(name = "update", class = "DataFilter", function(this){
  result <- this$.container$.result
  id <- this$.container$getFrameID(this$getIdentifier())
  if (id == "ID"){
    uniqueStates <- this$.allStates
  }
  else{
    uniqueStates <- unique(result$getSubFrame(id)[[this$getIdentifier()]])
  }
  
  this$.allCurrentStates <- c()
  for(state in uniqueStates){
    this$.allCurrentStates <- c(state, this$.allCurrentStates)
  }
  
  if (is.null(this$.selectedState)){
    this$.selectedState <- this$.allCurrentStates[1]
  }
  else if (this$.selectedState %in% this$.allCurrentStates == FALSE){
    this$.selectedState <- this$.allCurrentStates[1]
  }
})


setMethodS3(name = "updateNext", class = "DataFilter", abstract = TRUE, function(this){})


setMethodS3(name = "display", class = "DataFilter", abstract = TRUE, function(this){})
