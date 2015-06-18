library("R.oo", , quietly = TRUE)


setConstructorS3(name = "LegendFilter", function(selections = NULL){
  extend(DataFilter(selections), "LegendFilter")
})


setMethodS3(name = "notify", class = "LegendFilter", overwrite = TRUE, function(this, observers){
  #   this$.container$.tool$update()
  #   observers$toolObserver <- observers$toolObserver +1
  #   this$.container$.tool$notify(observers)
})


setMethodS3(name = "update", class = "LegendFilter", overwrite = TRUE, function(this){
  this$.allCurrentStates <- this$.allStates
})


setMethodS3(name = "display", class = "LegendFilter", overwrite = TRUE, function(this){
  selectInput("legend", "Legend",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
