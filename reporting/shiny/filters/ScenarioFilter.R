library("R.oo", , quietly = TRUE)


setConstructorS3(name = "ScenarioFilter", function(selections = NULL){
  extend(DataFilter(selections), "ScenarioFilter")
})


setMethodS3(name = "updateNext", class = "ScenarioFilter", abstract = TRUE, function(this){
  this$.container$.tool$update()
  this$.container$.tool$updateNext()
})


setMethodS3(name = "notifyView", class = "ScenarioFilter", overwrite = TRUE, function(this, observers){
  observers$scenarioObserver <- observers$scenarioObserver + 1
})


setMethodS3(name = "notifyNextView", class = "ScenarioFilter", overwrite = TRUE, function(this, observers){
  this$.container$.tool$notifyView(observers)
  this$.container$.tool$notifyNextView(observers)
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
