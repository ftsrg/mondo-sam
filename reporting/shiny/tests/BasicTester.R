setConstructorS3(name = "BasicTester", function(){
  extend(Object(), "BasicTester",
         .generalTestID = 0,
         .filterContainer = NULL,
         .plotContainer = NULL,
         .publisher = NULL)
})

setMethodS3(name = "getTestName", class = "BasicTester", abstract = TRUE, function(this){})


setMethodS3(name = "runTests", class = "BasicTester", abstract = TRUE, function(this){})


setMethodS3(name = "init", class = "BasicTester", function(this, result){
  this$.filterContainer <- FilterContainer()
  this$.plotContainer <- PlotContainer()
  this$.publisher <- Publisher()
  
  this$.filterContainer$setResult(result)
  this$.filterContainer$init()
  
  this$.plotContainer$.plotSettings$init(this$.filterContainer)
  this$.plotContainer$.theme$init()
})


setMethodS3(name = "setFilters", class = "BasicTester", function(this, scenario = NULL, tool = NULL, case = NULL, 
                                                                 size = NULL, phase = NULL, metric = NULL, 
                                                                 iteration = NULL, xDimension = NULL, legend = NULL,
                                                                 specificLegend = NULL){
  this$.filterContainer$.xDimension.selectedState <- xDimension
  this$.filterContainer$.legend$.selectedState <- legend
  this$.filterContainer$.scenario$update()
  this$.filterContainer$.scenario$.selectedState <- scenario
  this$.filterContainer$.tool$update()
  this$.filterContainer$.tool.selectedState <- tool
  this$.filterContainer$.case$update()
  this$.filterContainer$.case$.selectedState <- case
  this$.filterContainer$.size$update()
  this$.filterContainer$.size$.selectedState <- size
  this$.filterContainer$.phase$update()
  this$.filterContainer$.phase$.selectedState <- phase
  this$.filterContainer$.metric$update()
  this$.filterContainer$.metric$.selectedState <- metric
  this$.filterContainer$.iteration$update()
  this$.filterContainer$.iteration$.selectedState <- iteration
  this$.filterContainer$.specificLegend$update()
})


setMethodS3(name = "writeTestResult", class = "BasicTester", function(this, id, fail = FALSE, expected = "", received = ""){
  if (fail){
    cat(this$getTestName(), " ", id, " - FAIL, Expected: ", expected, " - Received: ", received,"\n")
  }
  else {
    cat(this$getTestName(), " ", id, " - OK\n")
  }
})