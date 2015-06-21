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

setMethodS3(name = "init", class = "PlotSettings", function(this, settings, filters){
  this$.xDimension <- filters$.xDimension$.selectedState
  this$.yDimension <- "MetricValue"
  this$.legend <- filters$.legend$.selectedState
  this$.xLabel <- settings$xLabel
  this$.yLabel <- settings$yLabel
  this$.title <- settings$title
  this$.xAxis <- settings$xAxis
  this$.yAxis <- settings$yAxis
  this$.yScale <- settings$yScale
  this$.texts <- settings$showValues
  this$.lines <- settings$drawLines
})
