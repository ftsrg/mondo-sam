library("R.oo", quietly = TRUE, warn.conflicts = FALSE)

setConstructorS3(name = "Result", function(){
  extend(Object(), "Result",
         .frame = NULL,
         .subFrames = NULL)
})


setMethodS3(name = "setFrame", class = "Result", function(this, results){
  if (is.null(results)){
    throw("Null results parameter in Result - setFrame")
  }
  this$.frame <- results
})


setMethodS3(name = "createSubFrames", class = "Result", function(this){
  if (is.null(this$.frame)){
    throw("Null frame attribute in Result - createSubFrames")
  }
  this$splitFrames(this$.frame, c("Scenario"))
  this$splitFrames(this$.frame, c("Tool"))
  this$splitFrames(this$.frame, c("CaseName"))
  this$splitFrames(this$.frame, c("Scenario", "Tool"))
  this$splitFrames(this$.frame, c("Scenario", "CaseName"))
  this$splitFrames(this$.frame, c("Tool", "CaseName"))
  this$splitFrames(this$.frame, c("Scenario", "Tool", "CaseName"))
})


setMethodS3(name = "splitFrames", class = "Result", private = TRUE, function(this, results, selections, id, index=0){
  if(length(selections) ==0){
    this$.subFrames[[id]] <- results
  }
  else {
    selected <- selections[1]
    uniqueValues <- unique(results[[selected]])
    for(value in uniqueValues){
      if (index == 0){
        id <- "ID"
      }
      newId <- paste(id, value, sep=".")
      newResults <- results[results[[selected]] == value, ]
      value <- as.character(value)
      newSelections <- selections[selections != selected]
      index <- index + 1
      this$splitFrames(newResults, newSelections, newId, index)
    }
  }
})


setMethodS3(name = "getSubFrame", class = "Result", function(this, id){
  if (is.null(id)){
    throw("Null id parameter in Result - getSubFrame")
  }
  return(this$.subFrames[[id]])
})



