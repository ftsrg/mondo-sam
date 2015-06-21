library("R.oo", , quietly = TRUE)


setConstructorS3(name = "PublishingFilter", function(selections = NULL){
  extend(DataFilter(selections), "PublishingFilter")
})


setMethodS3(name = "notify", class = "PublishingFilter", overwrite = TRUE, function(this, observers){
})


setMethodS3(name = "update", class = "PublishingFilter", overwrite = TRUE, function(this){
  this$.allCurrentStates <- this$.selections$.selections
  this$.selectedState <- NULL
})


setMethodS3(name = "display", class = "PublishingFilter", overwrite = TRUE, function(this){
  selectizeInput("publishFilter", label = "Publish All",
                 choices = this$.allCurrentStates,  
                 multiple = TRUE,
                 selected = this$selectedState)
})
