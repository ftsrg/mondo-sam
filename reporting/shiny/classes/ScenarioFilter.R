library("R.oo", , quietly = TRUE)


setConstructorS3(name = "ScenarioFilter", function(selections = NULL){
  extend(DataFilter(selections), "ScenarioFilter")
})


setMethodS3(name = "notify", class = "ScenarioFilter", overwrite = TRUE, function(this, observers){
  print("scenario notify")
  this$.container$.tool$update()
  observers$toolObserver <- observers$toolObserver + 1
  this$.container$.tool$notify(observers)
})


setMethodS3(name = "getIdentifier", class = "ScenarioFilter", overwrite = TRUE, function(this){
  return("Scenario")
})


setMethodS3(name = "display", class = "ScenarioFilter", overwrite = TRUE, function(this){
  if(!this$enable("Scenario")){
    # display nothing
    return()
  }
  selectInput("scenario", "Scenario",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
