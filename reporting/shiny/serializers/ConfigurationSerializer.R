setConstructorS3(name = "ConfigurationSerializer", function(){
  extend(Object(), "ConfigurationSerializer",
         .jsonData = NULL,
         .filterContainer = NULL,
         .plotContainer = NULL,
         .publisher = NULL)
})


setMethodS3(name = "export", class = "ConfigurationSerializer", function(this){
  
})


setMethodS3(name = "import", class = "ConfigurationSerializer", function(this, config){
  this$.filterContainer$import(config)
  this$.plotContainer$import(config)
  this$.publisher$import(config)
})


setMethodS3(name = "convertToJSON", class = "ConfigurationSerializer", function(this, plotContainer, filterContainer, publisher){
  if (is.null(plotContainer$.plotSettings)){
    data <- ""
  }
  else {
    data <- list(
      "Plot" = list(list(
        "X_Dimension" = filterContainer$.xDimension$.selectedState,
        "Legend" = filterContainer$.legend$.selectedState,
        "Legend_Filters" = list(filterContainer$.specificLegend$.selectedState),
        "Summarize_Function" = list(filterContainer$.phase$.selectedState),
        "Title" = plotContainer$.plotSettings$.title,
        "Metrics" = list(
          filterContainer$.metric$.selectedState
        ),
        "Metric_Scale" = plotContainer$.plotSettings$.yScale,
        "Min_Iteration" = filterContainer$.iteration[1], 
        "Max_Iteration" = filterContainer$.iteration[2],
        "X_Label" = plotContainer$.plotSettings$.xLabel,
        "Y_Label" = plotContainer$.plotSettings$.yLabel,
        "X_Axis_Scale" = plotContainer$.plotSettings$.xAxis,
        "Y_Axis_Scale" = plotContainer$.plotSettings$.yAxis,
        "Extension" = publisher$.format,
        "Show_Values" = plotContainer$.plotSettings$.texts,
        "Draw_Lines" = plotContainer$.plotSettings$.lines,
        "Legend_Position" = plotContainer$.theme$.legendPosition,
        "Legend_Direction" = plotContainer$.theme$.legendDirection,
        "Theme" = plotContainer$.theme$.style,
        "Point_Size" = plotContainer$.theme$.pointSize,
        "Line_Size" = plotContainer$.theme$.lineSize,
        "Text_Size" = plotContainer$.theme$.textSize,
        "Text_Font" = plotContainer$.theme$.family,
        "X_Text_Size" = plotContainer$.theme$.xTextSize,
        "Y_Text_Size" = plotContainer$.theme$.yTextSize,
        "X_Axis_Horizontal_Justice" = plotContainer$.theme$.xHjust,
        "X_Axis_Vertical_Justice" = plotContainer$.theme$.xVjust,
        "Y_Axis_Horizontal_Justice" = plotContainer$.theme$.yHjust,
        "Y_Axis_Vertical_Justice" = plotContainer$.theme$.yVjust,
        "Automatic_Filename" = publisher$.automaticFilename,
        "Specified_Filename" = publisher$.filename,
        "Diagram_Width" = publisher$.diagramWidth,
        "Diagram_Height" = publisher$.diagramHeight,
        "Diagram_DPI" = publisher$.diagramDPI
      ))
    )
  }
  
  this$.jsonData <- toJSON(data, 
                           pretty = T, 
                           auto_unbox = T, 
                           factor = "string", 
                           null = "null", 
                           na = "null")
  return(this$.jsonData)
})