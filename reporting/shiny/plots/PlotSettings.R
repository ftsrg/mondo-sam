setConstructorS3(name = "PlotSettings", function(){
  extend(Object(), "PlotSettings",
         .xDimension = NULL,
         .yDimension = NULL,
         .legend = NULL,
         .xLabel = NULL,
         .yLabel = NULL,
         .title = NULL,
         .xAxis = NULL,
         .yAxis = NULL,
         .yScale = NULL,
         .texts = NULL,
         .lines = NULL
         )
})

setMethodS3(name = "init", class = "PlotSettings", function(this, filters){
  this$.xDimension <- filters$.xDimension$.selectedState
  this$.yDimension <- "MetricValue"
  this$.legend <- filters$.legend$.selectedState
  this$.xLabel <- ""
  this$.yLabel <- ""
  this$.title <- ""
  this$.xAxis <- "log2"
  this$.yAxis <- "log2"
  this$.yScale <- 0
  this$.texts <- FALSE
  this$.lines <- TRUE
})
