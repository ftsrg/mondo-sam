library("R.oo", quietly = TRUE)


setConstructorS3(name = "FilterContainer", function(){
  extend(Object(), "FilterContainer",
         .selections = NULL,
         .result = NULL,
         .scenario = NULL,
         .tool = NULL,
         .case = NULL,
         .size = NULL,
         .phase = NULL,
         .metrics = NULL,
         .xDimension = NULL,
         .legend = NULL
         )
})


setMethodS3(name = "init", class = "FilterContainer", function(this){
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
  
  this$.case <- CaseFilter(sel)
  this$.case$setContainer(this)
  this$.case$.allStates <- unique(this$.result$.frame$CaseName)
  this$.case$update()
  
  this$.size <- SizeFilter(sel)
  this$.size$setContainer(this)
  this$.size$.allStates <- unique(this$.result$.frame$Size)
  this$.size$update()
  
  this$.phase <- PhaseFilter(sel)
  this$.phase$setContainer(this)
  this$.phase$.allStates <- unique(this$.result$.frame$PhaseName)
  this$.phase$update()
  
  this$.xDimension <- XDimensionFilter(sel)
  this$.xDimension$setContainer(this)
  this$.xDimension$.allStates <- c("Scenario", "CaseName", "Tool", "Size", "Iteration")
  this$.xDimension$.selectedState <- "Size"
  this$.xDimension$update()
  
  this$.legend <- LegendFilter(sel)
  this$.legend$setContainer(this)
  this$.legend$.allStates <- c("Scenario", "CaseName", "Tool", "Size", "MetricName")
  this$.legend$.selectedState <- "MetricName"
  this$.legend$update()

})


setMethodS3(name = "setResult", class = "FilterContainer", function(this, result){
  if (is.null(result)){
    throw("Null result parameter in FilterContainer - setResult")
  }
  this$.result <- result
})



setMethodS3(name = "getFrameID", class = "FilterContainer", function(this, limit = "Size"){
  id <- "ID"
  for(select in this$.selections$.defaultSelections){
    if(select == limit){
      return(id)
    }
    if (select %in% this$.selections$.selections){
      id <- paste(id, this$getValue(select), sep=".")
    }
  }
  return(id)
})


setMethodS3(name = "getValue", class = "FilterContainer", function(this, selected){
  if(selected == "Scenario"){
    return(this$.scenario$.selectedState)
  }
  if(selected == "CaseName"){
    return(this$.case$.selectedState)
  }
  if(selected == "Tool"){
    return(this$.tool$.selectedState)
  }
  if(selected == "Size"){
    return(this$.size$.selectedState)
  }
})


setMethodS3(name = "notifyFilters", class = "FilterContainer", function(this, observers){
  observers$scenarioObserver <- observers$scenarioObserver + 1
  observers$xDimensionObserver <- observers$xDimensionObserver + 1
  observers$legend <- observers$legend + 1
  this$.scenario$notify(observers)
})