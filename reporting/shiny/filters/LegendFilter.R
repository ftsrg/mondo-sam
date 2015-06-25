library("R.oo", , quietly = TRUE)


setConstructorS3(name = "LegendFilter", function(selections = NULL){
  extend(DataFilter(selections), "LegendFilter")
})


setMethodS3(name = "updateNext", class = "LegendFilter", abstract = TRUE, function(this){
  # a magnificent empty method
})


setMethodS3(name = "notifyView", class = "LegendFilter", overwrite = TRUE, function(this, observers){
  observers$legendObserver <- observers$legendObserver + 1
})


setMethodS3(name = "notifyNextView", class = "LegendFilter", overwrite = TRUE, function(this, observers){
  # empty
})

setMethodS3(name = "update", class = "LegendFilter", overwrite = TRUE, function(this){
  this$.allCurrentStates <- this$.allStates
})


setMethodS3(name = "display", class = "LegendFilter", overwrite = TRUE, function(this){
  selectInput("legend", "Legend",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
