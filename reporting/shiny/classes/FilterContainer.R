library("R.oo", quietly = TRUE)


setConstructorS3(name = "FilterContainer", function(){
  extend(Object(), "FilterContainer",
         .selections = NULL,
         .result = NULL,
         .tool = NULL)
})


setMethodS3(name = "init", class = "FilterContainer", function(this){
  print("Initialize")
  sel <- Selections()
  this$.selections <- sel
  
  this$.tool <- ToolFilter(sel)
  this$.tool$setContainer(this)
  this$.tool$update()
  
  
})


setMethodS3(name = "setResult", class = "FilterContainer", function(this, result){
  if (is.null(result)){
    throw("Null result parameter in FilterContainer - setResult")
  }
  this$.result <- result
})
