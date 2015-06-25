setConstructorS3(name = "GenerationTester", function(){
  extend(BasicTester(), "GenerationTester",
         .serializer = NULL)
})


setMethodS3(name = "getTestName", class = "GenerationTester", overwrite = TRUE, function(this){
  return("Generation test")
})



setMethodS3(name = "runTests", class = "GenerationTester", overwrite = TRUE, function(this){
  this$generateTest1()
  this$generateTest2()
  this$generateTest3()
})


setMethodS3(name = "generateTest1", class = "GenerationTester", function(this){
  this$setFilters(xDimension = "Size", legend = "Tool", scenario = "User", case = "PosLength", phase = c("Check", "Read"), metric = "Time")
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  this$.serializer$export("temp/config.json")
  
  this$generate()
  if (length(this$.plotContainer$.plots) == 6){
    this$writeTestResult(1)
  }
  else {
    this$writeTestResult(1, T, 6, length(this$.plotContainer$.plots))
  }
})


setMethodS3(name = "generateTest2", class = "GenerationTester", function(this){
  this$setFilters(xDimension = "Size", legend = "Tool", scenario = "User", case = "PosLength", phase = c("ReCheck", "LHS"), metric = "Time")
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  this$.serializer$export("temp/config.json")
  
  this$generate()
  if (length(this$.plotContainer$.plots) == 6){
    this$writeTestResult(2)
  }
  else {
    this$writeTestResult(2, T, 6, length(this$.plotContainer$.plots))
  }
})


setMethodS3(name = "generateTest3", class = "GenerationTester", function(this){
  this$setFilters(xDimension = "Iteration", legend = "MetricName", scenario = "User", case = "PosLength", tool = "Sesame", size = "4", phase = c("ReCheck", "LHS"), metric = "Time")
  print(this$.filterContainer$.xDimension.selectedState)
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  print(this$.filterContainer$.xDimension.selectedState)
  cat("Serialzer dim: ", this$.serializer$.filterContainer$.xDimension.selectedState, "\n")
  this$.serializer$export("temp/config.json")
  
  this$generate()
  if (length(this$.plotContainer$.plots) == 18){
    this$writeTestResult(3)
  }
  else {
    this$writeTestResult(3, T, 18, length(this$.plotContainer$.plots))
  }
})


setMethodS3(name = "generate", class = "GenerationTester", function(this){
  data <- read.csv("../example/example.csv", header=TRUE, sep=',')
  
  config <- fromJSON("./temp/config.json")
  
  validate(data, config)
  
  this$.publisher$.location <- "./temp/"
  this$.plotContainer$.plots <- list()
  
  generatePlots(this$.filterContainer$.result, 
                data,
                config,
                this$.plotContainer, 
                this$.filterContainer, 
                this$.publisher, 
                this$.serializer)
  
})