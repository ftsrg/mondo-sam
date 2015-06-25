library("R.oo", , quietly = TRUE)


setConstructorS3(name = "CaseFilter", function(selections = NULL){
  extend(DataFilter(selections), "CaseFilter")
})


setMethodS3(name = "updateNext", class = "CaseFilter", abstract = TRUE, function(this){
  this$.container$.size$update()
  this$.container$.size$updateNext()
})


setMethodS3(name = "notifyView", class = "CaseFilter", overwrite = TRUE, function(this, observers){
  observers$caseObserver <- observers$caseObserver + 1
})


setMethodS3(name = "notifyNextView", class = "CaseFilter", overwrite = TRUE, function(this, observers){
  this$.container$.size$notifyView(observers)
  this$.container$.size$notifyNextView(observers)
})


setMethodS3(name = "getIdentifier", class = "CaseFilter", overwrite = TRUE, function(this){
  return("CaseName")
})


setMethodS3(name = "display", class = "CaseFilter", overwrite = TRUE, function(this){
  if(!this$enable("CaseName")){
    # display nothing
    return()
  }
  selectInput("case", "Case",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
