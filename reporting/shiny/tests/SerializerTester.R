setConstructorS3(name = "SerializerTester", function(){
  extend(BasicTester(), "SerializerTester",
         .serializer = NULL)
})


setMethodS3(name = "getTestName", class = "SerializerTester", overwrite = TRUE, function(this){
  return("Serializer test")
})



setMethodS3(name = "runTests", class = "SerializerTester", overwrite = TRUE, function(this){
  this$testNullValues()
  this$testSingleValues()
  this$testMultiplePhases()
  this$testGeneration()
})


setMethodS3(name = "generate", class = "SerializerTester", function(this){
  data <- read.csv("../example/example.csv", header=TRUE, sep=',')
  
  config <- fromJSON("./temp/config.json")
  
  validate(data, config)
  
  this$.publisher$.location <- "./temp/"
  
  generatePlots(this$.filterContainer$.result, 
                data,
                config,
                this$.plotContainer, 
                this$.filterContainer, 
                this$.publisher, 
                this$.serializer)
  
})


setMethodS3(name = "testNullValues", class = "SerializerTester", private = TRUE, function(this){
  this$setFilters(xDimension = "Size", legend = "Tool", scenario = "User", case = "PosLength")
  
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  this$.serializer$export("temp/config.json")
  
  config <- fromJSON("./temp/config.json")
  
  this$isList(1, config, "Legend_Filters")
  this$lengthEquals(2, config, "Legend_Filters", 1)
  this$isNa(3, config, "Legend_Filters")
  
  this$isList(4, config, "Summarize_Function")
  this$lengthEquals(5, config, "Summarize_Function", 1)
  this$isNa(6, config, "Summarize_Function")
  
  this$isList(7, config, "Metrics")
  this$lengthEquals(8, config, "Metrics", 1)
  this$isNa(9, config, "Metrics")
})


setMethodS3(name = "testSingleValues", class = "SerializerTester", private = TRUE, function(this){
  this$setFilters(xDimension = "Size", legend = "Tool", scenario = "User", case = "PosLength", phase = "Check", metric = "Time")
  
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  this$.serializer$export("temp/config.json")
  
  config <- fromJSON("./temp/config.json")
  
  this$isList(10, config, "Legend_Filters")
  this$lengthEquals(11, config, "Legend_Filters", 3)
  
  this$isList(12, config, "Summarize_Function")
  this$lengthEquals(13, config, "Summarize_Function", 1)
  
  this$isList(14, config, "Metrics")
  this$lengthEquals(15, config, "Metrics", 1)
  
  this$setFilters(xDimension = "Size", legend = "Metric", tool = "Sesame", scenario = "User", case = "PosLength", phase = "Read", metric = "Time")
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  this$.serializer$export("temp/config.json")
  
  config <- fromJSON("./temp/config.json")
  
  this$isList(16, config, "Legend_Filters")
  this$lengthEquals(17, config, "Legend_Filters", 1)
  
  this$isList(18, config, "Summarize_Function")
  this$lengthEquals(19, config, "Summarize_Function", 1)
  
  this$isList(20, config, "Metrics")
  this$lengthEquals(21, config, "Metrics", 1)
})


setMethodS3(name = "testMultiplePhases", class = "SerializerTester", private = TRUE, function(this){
  this$setFilters(xDimension = "Size", legend = "Tool", scenario = "User", case = "PosLength", phase = c("Check", "Read"), metric = "Time")
  
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  this$.serializer$export("temp/config.json")
  
  config <- fromJSON("./temp/config.json")
  
  this$isList(22, config, "Legend_Filters")
  this$lengthEquals(23, config, "Legend_Filters", 3)
  
  this$isList(24, config, "Summarize_Function")
  this$lengthEquals(25, config, "Summarize_Function", 2)
  
  this$isList(26, config, "Metrics")
  this$lengthEquals(27, config, "Metrics", 1)
})


setMethodS3(name = "testGeneration", class = "SerializerTester", private = TRUE, function(this){
  this$setFilters(xDimension = "Size", legend = "Tool", scenario = "User", case = "PosLength", phase = c("Check", "Read"), metric = "Time")
  jsonData <- this$.serializer$convertToJSON(this$.plotContainer, this$.filterContainer, this$.publisher)
  this$.serializer$export("temp/config.json")
  
  this$generate()
})


setMethodS3(name = "isList", class = "SerializerTester", function(this, testID, config, param){
  if (is.list(config$Plot[1,][[param]])){
    this$writeTestResult(testID)
  }
  else {
    this$writeTestResult(testID, T, "List", class(config$Plot[1,][[param]]))
  }
})


setMethodS3(name = "lengthEquals", class = "SerializerTester", function(this, testID, config, param, lengthValue){
  if (length(config$Plot[1,][[param]]) == lengthValue){
    this$writeTestResult(testID)
  }
  else {
    this$writeTestResult(testID, T, lengthValue, length(config$Plot[1,][[param]]))
  }
})


setMethodS3(name = "isNa", class = "SerializerTester", function(this, testID, config, param){
  if (is.na(config$Plot[1,][[param]][1])){
    this$writeTestResult(testID)
  }
  else {
    this$writeTestResult(testID, T, "NA", config$Plot[1,][[param]][1])
  }
})