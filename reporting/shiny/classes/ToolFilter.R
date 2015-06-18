library("R.oo", , quietly = TRUE)


setConstructorS3(name = "ToolFilter", function(selections = NULL){
  extend(DataFilter(selections), "ToolFilter")
  
})


setMethodS3(name = "notify", class = "ToolFilter", overwrite = TRUE, function(this, observers){
  this$.container$.case$update()
  observers$caseObserver <- observers$caseObserver + 1
  this$.container$.case$notify(observers)
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
