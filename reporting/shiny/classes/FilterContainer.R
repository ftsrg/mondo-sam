library("R.oo", , quietly = TRUE)


setConstructorS3(name = "FilterContainer", function(){
  extend(Object(), "FilterContainer",
         .selections = NULL,
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

