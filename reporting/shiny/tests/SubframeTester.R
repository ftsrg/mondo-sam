setConstructorS3(name = "SubframeTester", function(){
  extend(BasicTester(), "SubframeTester",
         .result = NULL)
})


setMethodS3(name = "getTestName", class = "SubframeTester", overwrite = TRUE, function(this){
  return("Subframe test")
})


setMethodS3(name = "runTests", class = "SubframeTester", overwrite = TRUE, function(this){
  this$.result$createSubFrames()
  
  expected <- 47
  framesNumber <- length(this$.result$.subFrames)
  if (framesNumber == expected){
    this$writeTestResult(1)
  }
  else {
    this$writeTestResult(1, T, expected, framesNumber)
  }
  
  frameID <- "ID.User"
  this$testFrameRows(2, frameID, 1836)
  this$testFrameUniqueValues(2.1, frameID, "Scenario", "User")
  
  frameID <- "ID.Repair"
  this$testFrameRows(3, frameID, 540)
  this$testFrameUniqueValues(3.1, frameID, "Scenario", "Repair")
  
  frameID <- "ID.Sesame"
  this$testFrameRows(4, frameID, 792)
  this$testFrameUniqueValues(4.1, frameID, "Tool", "Sesame")
  
  frameID <- "ID.Neo4j"
  this$testFrameRows(5, frameID, 792)
  this$testFrameUniqueValues(5.1, frameID, "Tool", "Neo4j")
  
  frameID <- "ID.EMFIncQuery"
  this$testFrameRows(6, frameID, 792)
  this$testFrameUniqueValues(6.1, frameID, "Tool", "EMFIncQuery")
  
  frameID <- "ID.ConnectedSegments"
  this$testFrameRows(7, frameID, 792)
  this$testFrameUniqueValues(7.1, frameID, "CaseName", "ConnectedSegments")
  
  frameID <- "ID.PosLength"
  this$testFrameRows(8, frameID, 792)
  this$testFrameUniqueValues(8.1, frameID, "CaseName", "PosLength")
  
  frameID <- "ID.RouteSensor"
  this$testFrameRows(9, frameID, 792)
  this$testFrameUniqueValues(9.1, frameID, "CaseName", "RouteSensor")
  
  
  frameID <- "ID.User.Neo4j"
  this$testFrameRows(10, frameID, 612)
  this$testFrameUniqueValues(10.1, frameID, "Scenario", "User")
  this$testFrameUniqueValues(10.2, frameID, "Tool", "Neo4j")
  
  frameID <- "ID.User.Sesame"
  this$testFrameRows(11, frameID, 612)
  this$testFrameUniqueValues(11.1, frameID, "Scenario", "User")
  this$testFrameUniqueValues(11.2, frameID, "Tool", "Sesame")
  
  frameID <- "ID.User.EMFIncQuery"
  this$testFrameRows(12, frameID, 612)
  this$testFrameUniqueValues(12.1, frameID, "Scenario", "User")
  this$testFrameUniqueValues(12.2, frameID, "Tool", "EMFIncQuery")
  
  frameID <- "ID.Repair.Neo4j"
  this$testFrameRows(13, frameID, 180)
  this$testFrameUniqueValues(13.1, frameID, "Scenario", "Repair")
  this$testFrameUniqueValues(13.2, frameID, "Tool", "Neo4j")
  
  frameID <- "ID.Repair.Sesame"
  this$testFrameRows(14, frameID, 180)
  this$testFrameUniqueValues(14.1, frameID, "Scenario", "Repair")
  this$testFrameUniqueValues(14.2, frameID, "Tool", "Sesame")
  
  frameID <- "ID.Repair.EMFIncQuery"
  this$testFrameRows(15, frameID, 180)
  this$testFrameUniqueValues(15.1, frameID, "Scenario", "Repair")
  this$testFrameUniqueValues(15.2, frameID, "Tool", "EMFIncQuery")
  
  
  frameID <- "ID.Repair.ConnectedSegments"
  this$testFrameRows(16, frameID, 180)
  this$testFrameUniqueValues(16.1, frameID, "Scenario", "Repair")
  this$testFrameUniqueValues(16.2, frameID, "CaseName", "ConnectedSegments")
  
  frameID <- "ID.Repair.PosLength"
  this$testFrameRows(17, frameID, 180)
  this$testFrameUniqueValues(17.1, frameID, "Scenario", "Repair")
  this$testFrameUniqueValues(17.2, frameID, "CaseName", "PosLength")
  
  frameID <- "ID.Repair.RouteSensor"
  this$testFrameRows(18, frameID, 180)
  this$testFrameUniqueValues(18.1, frameID, "Scenario", "Repair")
  this$testFrameUniqueValues(18.2, frameID, "CaseName", "RouteSensor")
  
  frameID <- "ID.User.ConnectedSegments"
  this$testFrameRows(19, frameID, 612)
  this$testFrameUniqueValues(19.1, frameID, "Scenario", "User")
  this$testFrameUniqueValues(19.2, frameID, "CaseName", "ConnectedSegments")
  
  frameID <- "ID.User.PosLength"
  this$testFrameRows(20, frameID, 612)
  this$testFrameUniqueValues(20.1, frameID, "Scenario", "User")
  this$testFrameUniqueValues(20.2, frameID, "CaseName", "PosLength")
  
  frameID <- "ID.User.RouteSensor"
  this$testFrameRows(21, frameID, 612)
  this$testFrameUniqueValues(21.1, frameID, "Scenario", "User")
  this$testFrameUniqueValues(21.2, frameID, "CaseName", "RouteSensor")
})


setMethodS3(name = "testFrameRows", class = "SubframeTester", function(this, testID, frameID, expectedRows){
  frame <- this$.result$getSubFrame(frameID)
  len <- nrow(frame)
  if (len == expectedRows){
    this$writeTestResult(testID)
  }
  else {
    this$writeTestResult(testID, T, expectedRows, len)
  }
})


setMethodS3(name = "testFrameUniqueValues", class = "SubframeTester", function(this, testID, frameID, column, expectedValues){
  frame <- this$.result$getSubFrame(frameID)
  values <- unique(frame[[column]])
  if (values == expectedValues) {
    this$writeTestResult(testID)
  }
  else {
    this$writeTestResult(testID, T, expectedValues, values)
  }
})