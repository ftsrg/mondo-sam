library("R.oo", , quietly = TRUE)


setConstructorS3(name = "PublishingFilter", function(selections = NULL){
  extend(DataFilter(selections), "PublishingFilter")
})


setMethodS3(name = "updateNext", class = "PublishingFilter", abstract = TRUE, function(this){
  # empty
})


setMethodS3(name = "notifyView", class = "PublishingFilter", overwrite = TRUE, function(this, observers){
  observers$publishingObserver <- observers$publishingObserver + 1
})


setMethodS3(name = "notifyNextView", class = "PublishingFilter", overwrite = TRUE, function(this, observers){
  # empty
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
