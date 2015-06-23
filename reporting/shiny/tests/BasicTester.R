setConstructorS3(name = "BasicTester", function(){
  extend(Object(), "BasicTester",
         .generalTestID = 0)
})

setMethodS3(name = "getTestName", class = "BasicTester", abstract = TRUE, function(this){})


setMethodS3(name = "runTests", class = "BasicTester", abstract = TRUE, function(this){})


setMethodS3(name = "writeTestResult", class = "BasicTester", function(this, id, fail = FALSE, expected = "", received = ""){
  if (fail){
    cat(this$getTestName(), " ", id, " - FAIL, Expected: ", expected, " - Received: ", received,"\n")
  }
  else {
    cat(this$getTestName(), " ", id, " - OK\n")
  }
  
})