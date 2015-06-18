library("R.oo", , quietly = TRUE)


setConstructorS3(name = "XDimensionFilter", function(selections = NULL){
  extend(DataFilter(selections), "XDimensionFilter")
})


setMethodS3(name = "notify", class = "XDimensionFilter", overwrite = TRUE, function(this, observers){
})


setMethodS3(name = "update", class = "XDimensionFilter", overwrite = TRUE, function(this){
  this$.allCurrentStates <- this$.allStates
})


setMethodS3(name = "display", class = "XDimensionFilter", overwrite = TRUE, function(this){
  selectInput("xDimension", "X Dimension",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
