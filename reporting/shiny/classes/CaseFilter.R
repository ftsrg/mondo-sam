library("R.oo", , quietly = TRUE)


setConstructorS3(name = "CaseFilter", function(selections = NULL){
  extend(DataFilter(selections), "CaseFilter")
})


setMethodS3(name = "notify", class = "CaseFilter", overwrite = TRUE, function(this, observers){
  print("case notify")
  this$.container$.size$update()
  observers$sizeObserver <- observers$sizeObserver + 1
  this$.container$.size$notify(observers)
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
