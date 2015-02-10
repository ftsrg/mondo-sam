PlotSettings <- setClass(
  "PlotSettings",
  
  slots = c(
             xLabel = "character",
             yLabel = "character",
             title = "character",
             xAxis = "character",
             yAxis = "character"
           ),
  
  prototype=list(
                 xLabel = "",
                 yLabel = "",
                 title = "",
                 xAxis = "",
                 yAxis = ""
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