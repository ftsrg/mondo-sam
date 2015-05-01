PlotSettings <- setClass(
  "PlotSettings",
  
  slots = c(
             xDimension = "character",
             yDimension = "character",
             legend = "character",
             xLabel = "character",
             yLabel = "character",
             title = "character",
             xAxis = "character",
             yAxis = "character",
             yScale = "numeric",
             theme = "character",
             texts = "logical",
             lines = "logical"
             
           ),
  
  prototype=list(
                 xDimension = "",
                 yDimension = "",
                 legend = "",
                 xLabel = "",
                 yLabel = "",
                 title = "",
                 xAxis = "",
                 yAxis = "",
                 yScale = 0,
                 theme = "",
                 texts = FALSE,
                 lines = TRUE
                )
  )

setGeneric(name="setDimensions",
           def=function(theObject, xDimension, yDimension){
             standardGeneric("setDimensions")
           }
)

setMethod(f="setDimensions",
          signature="PlotSettings",
          definition=function(theObject, xDimension, yDimension){
            theObject@xDimension <- xDimension
            theObject@yDimension <- yDimension
            return(theObject)
          })

setGeneric(name="setLegend",
           def=function(theObject, legend){
             standardGeneric("setLegend")
           }
)

setMethod(f="setLegend",
          signature="PlotSettings",
          definition=function(theObject, legend){
            theObject@legend <- legend
            return(theObject)
          })

setGeneric(name="setTitle",
           def=function(theObject, title){
             standardGeneric("setTitle")
           }
)

setMethod(f="setTitle",
          signature="PlotSettings",
          definition=function(theObject, title){
            theObject@title <- title
            return(theObject)
          })

setGeneric(name="setLabels",
           def=function(theObject, xLabel, yLabel){
                standardGeneric("setLabels")
           }
           )

setMethod(f="setLabels",
          signature="PlotSettings",
          definition=function(theObject, xLabel, yLabel){
            theObject@xLabel <- xLabel
            theObject@yLabel <- yLabel
            return(theObject)
          })

setGeneric(name="setAxis",
           def=function(theObject, xAxis, yAxis){
             standardGeneric("setAxis")
           }
)

setMethod(f="setAxis",
          signature="PlotSettings",
          definition=function(theObject, xAxis, yAxis){
            theObject@xAxis <- xAxis
            theObject@yAxis <- yAxis
            return(theObject)
          })

setGeneric(name="setYScale",
           def=function(theObject, yScale){
             standardGeneric("setYScale")
           }
)

setMethod(f="setYScale",
          signature="PlotSettings",
          definition=function(theObject, yScale){
            theObject@yScale <- yScale
            return(theObject)
          })

setGeneric(name="setTheme",
           def=function(theObject, theme){
             standardGeneric("setTheme")
           }
)

setMethod(f="setTheme",
          signature="PlotSettings",
          definition=function(theObject, theme){
            theObject@theme <- theme
            return(theObject)
          })

setGeneric(name="showTexts",
           def=function(theObject, enable){
             standardGeneric("showTexts")
           }
)

setMethod(f="showTexts",
          signature="PlotSettings",
          definition=function(theObject, enable){
            theObject@texts <- enable
            return(theObject)
          })

setGeneric(name="drawLines",
           def=function(theObject, enable){
             standardGeneric("drawLines")
           }
)

setMethod(f="drawLines",
          signature="PlotSettings",
          definition=function(theObject, enable){
            theObject@lines <- enable
            return(theObject)
          })
