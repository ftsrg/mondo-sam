setConstructorS3(name = "LoaderTester", function(){
  extend(BasicTester(), "LoaderTester",
         .results = NULL)
})


setMethodS3(name = "getTestName", class = "LoaderTester", overwrite = TRUE, function(this){
  return("Loading test")
})


setMethodS3(name = "load", class = "LoaderTester", function(this, sep, quote = ''){
  dataPath <- "../example/example.csv"
  this$.results <-read.csv(dataPath, header = TRUE, sep = sep, 
                          quote = quote)
})


setMethodS3(name = "runTests", class = "LoaderTester", overwrite = TRUE, function(this){
  this$test1()
  this$test2()
})


setMethodS3(name = "test1", class = "LoaderTester", function(this){
  this$load(",", '')
  if (is.null(this$.results)){
    this$writeTestResult(1, fail = T, "DataFrame object", "NUll")
  }
  else {
    this$writeTestResult(1)
  }
})


setMethodS3(name = "test2", class = "LoaderTester", function(this){
  this$load(",", '')
  rows <- 2376
  if (nrow(this$.results) == rows){
    this$writeTestResult(2)
  }
  else {
    this$writeTestResult(2, T, rows, nrow(this$.results))
  }
})

