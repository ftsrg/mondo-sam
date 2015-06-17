library("R.oo", , quietly = TRUE)

#' DataFilter class
setConstructorS3(name = "DataFilter", abstract = TRUE, function(selections = NULL){
  extend(Object(), "DataFilter",
         .selections = selections,
         .container = NULL,
         .currentState = "",
         .allStates = "",
         .prevState = "")
})


setMethodS3(name = "getState", class = "DataFilter", function(this){
  if (is.null(this$.currentState)){
    throw("Null state in DataFilter - getState")
  }
  this$.currentState
})


setMethodS3(name = "setState", class = "DataFilter", function(this, state){
  if (is.null(.currentState)){
    throw("Null value in DataFilter - setState")
  }
  this$.currentState <- state
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
  if(filterName %in% this$.selections$getSelections == FALSE){
    return(FALSE)
  }
  return(TRUE)
})


setMethodS3(name = "notify", class = "DataFilter", abstract = TRUE, function(this){})


setMethodS3(name = "update", class = "DataFilter", abstract = TRUE, function(this){})


setMethodS3(name = "display", class = "DataFilter", abstract = TRUE, function(this){})
