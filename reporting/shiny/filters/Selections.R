library("R.oo", , quietly = TRUE)

setConstructorS3(name = "Selections", function(){
  extend(Object(), "Selections", 
         .selections = c("Scenario", "Tool", "CaseName"),
         .defaultSelections = c("Scenario", "Tool", "CaseName", "Size")
         )
})

#' Return selections attribute
setMethodS3(name = "getSelections", class = "Selections", function(this) {
  this$.selections
})

#' Set the selections attribute to the default values (defaultSelections), 
#' and remove the arbitrarily given arguments from it.
setMethodS3(name = "changeSelections", class = "Selections", function(this, ...) {
  args <- list(...)
  if (length(args) == 0){
    throw("Arguments were not given for changing selections.")
  }
  if (length(args) > length(this$.selections)){
    throw("Too many arguments were given for changing selections.")
  }
  
  this$.selections <- this$.defaultSelections
  for (a in args){
    this$.selections <- this$.selections[this$.selections != a]
  }
})
