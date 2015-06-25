library("R.oo", , quietly = TRUE)


setConstructorS3(name = "SizeFilter", function(selections = NULL){
  extend(DataFilter(selections), "SizeFilter")
})


setMethodS3(name = "updateNext", class = "SizeFilter", abstract = TRUE, function(this){
  this$.container$.phase$update()
  this$.container$.phase$updateNext()
})


setMethodS3(name = "notifyView", class = "SizeFilter", overwrite = TRUE, function(this, observers){
  observers$sizeObserver <- observers$sizeObserver + 1
})


setMethodS3(name = "notifyNextView", class = "SizeFilter", overwrite = TRUE, function(this, observers){
  this$.container$.phase$notifyView(observers)
  this$.container$.phase$notifyNextView(observers)
})


setMethodS3(name = "getIdentifier", class = "SizeFilter", overwrite = TRUE, function(this){
  return("Size")
})


setMethodS3(name = "display", class = "SizeFilter", overwrite = TRUE, function(this){
  if(!this$enable("Size")){
    return()
  }
  this$.allCurrentStates <- sort(as.numeric(this$.allCurrentStates))
  selectInput("size", "Size",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
