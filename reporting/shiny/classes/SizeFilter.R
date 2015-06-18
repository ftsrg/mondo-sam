library("R.oo", , quietly = TRUE)


setConstructorS3(name = "SizeFilter", function(selections = NULL){
  extend(DataFilter(selections), "SizeFilter")
})


setMethodS3(name = "notify", class = "SizeFilter", overwrite = TRUE, function(this, observers){
    this$.container$.phase$update()
    observers$phaseObserver <- observers$phaseObserver +1
    this$.container$.phase$notify(observers)
})


setMethodS3(name = "getIdentifier", class = "SizeFilter", overwrite = TRUE, function(this){
  return("Size")
})


setMethodS3(name = "display", class = "SizeFilter", overwrite = TRUE, function(this){
  if(!this$enable("Size")){
    # display nothing
    return()
  }
  this$.allCurrentStates <- sort(as.numeric(this$.allCurrentStates))
  selectInput("size", "Size",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
