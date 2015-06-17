library("R.oo", , quietly = TRUE)


setConstructorS3(name = "ToolFilter", abstract = TRUE, function(selections = NULL){
  extend(DataFilter(selections), "ToolFilter")
})

setMethodS3(name = "getState", class = "ToolFilter", overwrite = TRUE, function(this){
  print("overwrote")
})

setMethodS3(name = "update", class = "ToolFilter", overwrite = TRUE, function(this){
  print(values$subTables)
})

setMethodS3(name = "notify", class = "ToolFilter", overwrite = TRUE, function(this){
  
})

setMethodS3(name = "display", class = "ToolFilter", overwrite = TRUE, function(this){
  print("Disply called")
})
