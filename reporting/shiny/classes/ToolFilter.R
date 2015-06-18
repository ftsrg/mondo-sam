library("R.oo", , quietly = TRUE)


setConstructorS3(name = "ToolFilter", abstract = TRUE, function(selections = NULL){
  extend(DataFilter(selections), "ToolFilter")
})


setMethodS3(name = "notify", class = "ToolFilter", overwrite = TRUE, function(this, observers){
  print("tool notify")
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
