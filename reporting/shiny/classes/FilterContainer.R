library("R.oo", quietly = TRUE)


setConstructorS3(name = "FilterContainer", function(){
  extend(Object(), "FilterContainer",
         .selections = NULL,
         .result = NULL,
         .tool = NULL,
         .scenario = NULL)
})


setMethodS3(name = "init", class = "FilterContainer", function(this){
  print("Initialize")
  sel <- Selections()
  this$.selections <- sel
  
  this$.scenario <- ScenarioFilter(sel)
  this$.scenario$setContainer(this)
  this$.scenario$.allStates <- unique(this$.result$.frame$Scenario)
  this$.scenario$update()
  
  this$.tool <- ToolFilter(sel)
  this$.tool$setContainer(this)
  this$.tool$.allStates <- unique(this$.result$.frame$Tool)
  this$.tool$update()
  
  
  
})


setMethodS3(name = "setResult", class = "FilterContainer", function(this, result){
  if (is.null(result)){
    throw("Null result parameter in FilterContainer - setResult")
  }
  this$.result <- result
})



setMethodS3(name = "getFrameID", class = "FilterContainer", function(this, limit = "Size"){
  print("getFrameid start")
  id <- "ID"
  for(select in this$.selections$.defaultSelections){
    if(select == limit){
      return(id)
    }
    if (select %in% this$.selections$.selections){
      id <- paste(id, this$getValue(select), sep=".")
    }
  }
  print("getFrameid end")
  return(id)
})


setMethodS3(name = "getValue", class = "FilterContainer", function(this, selected){
  if(selected == "Scenario"){
    return(this$.scenario$.selectedState)
  }
  if(selected == "CaseName"){
#     return(this$.case$.currentState)
  }
  if(selected == "Tool"){
    return(this$.tool$.selectedState)
  }
  if(selected == "Size"){
#     return(this$.size$.currentState)
  }
})