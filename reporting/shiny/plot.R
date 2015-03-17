PlotSettings <- setClass(
  "PlotSettings",
  
  slots = c(
             xLabel = "character",
             yLabel = "character",
             title = "character",
             xAxis = "character",
             yAxis = "character",
             yScale = "numeric",
             theme = "character",
             showValues = "logical"
           ),
  
  prototype=list(
                 xLabel = "",
                 yLabel = "",
                 title = "",
                 xAxis = "",
                 yAxis = "",
                 yScale = 0,
                 theme = "",
                 showValues = FALSE
                )
  )

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
          }
)

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
          }
)

setGeneric(name="showValues",
           def=function(theObject, showValues){
             standardGeneric("showValues")
           }
)

setMethod(f="showValues",
          signature="PlotSettings",
          definition=function(theObject, showValues){
            theObject@showValues <- showValues
            return(theObject)
          }
)