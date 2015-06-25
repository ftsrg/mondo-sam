library("R.oo", , quietly = TRUE)


setConstructorS3(name = "ToolFilter", function(selections = NULL){
  extend(DataFilter(selections), "ToolFilter")
  
})


setMethodS3(name = "updateNext", class = "ToolFilter", abstract = TRUE, function(this){
  this$.container$.case$update()
  this$.container$.case$updateNext()
})


setMethodS3(name = "notifyView", class = "ToolFilter", overwrite = TRUE, function(this, observers){
  observers$toolObserver <- observers$toolObserver + 1
})


setMethodS3(name = "notifyNextView", class = "ToolFilter", overwrite = TRUE, function(this, observers){
  this$.container$.case$notifyView(observers)
  this$.container$.case$notifyNextView(observers)
})


setMethodS3(name = "getIdentifier", class = "ToolFilter", overwrite = TRUE, function(this){
  return("Tool")
})


setMethodS3(name = "display", class = "ToolFilter", overwrite = TRUE, function(this){
  if(!this$enable("Tool")){
    # display nothing
    return()
  }
  selectInput("tool", "Tool",
              choices = this$.allCurrentStates,
              selected = this$.selectedState)
  
})
