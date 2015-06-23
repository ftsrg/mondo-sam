setConstructorS3(name = "ConfigurationSerializer", function(){
  extend(Object(), "ConfigurationSerializer",
         .jsonData = NULL)
})


setMethodS3(name = "export", class = "ConfigurationSerializer", function(this){
  
})


setMethodS3(name = "import", class = "ConfigurationSerializer", function(this, filterContainer, plotContainer, publisher){
  this$adjustConfigData(filterContainer$.xDimension$.selectedState, config, "X_Dimension")
  this$adjustConfigData(filterContainer$.legend$.selectedState, config, "Legend")
  this$adjustConfigData(filterContainer$.specificLegend$.selectedState, config, "Legend_Filters")
  this$adjustConfigData(filterContainer$.phase$.selectedState, config, "Summarize_Function")
  this$adjustConfigData(plotContainer$.plotSettings$.title, config, "Title")
  this$adjustConfigData(filterContainer$.metric$.selectedState, config, "Metrics")
  this$adjustConfigData(plotContainer$.plotSettings$.yScale, config, "Metric_Scale")
  this$adjustConfigData(filterContainer$.iteration[1], config, "Min_Iteration")
  this$adjustConfigData(filterContainer$.iteration[2], config, "Max_Iteration")
  this$adjustConfigData(plotContainer$.plotSettings$.xLabel, config, "X_Label")
  this$adjustConfigData(plotContainer$.plotSettings$.yLabel, config, "Y_Label")
  this$adjustConfigData(plotContainer$.plotSettings$.xAxis, config, "X_Axis_Scale")
  this$adjustConfigData(plotContainer$.plotSettings$.yAxis, config, "Y_Axis_Scale")
  this$adjustConfigData(publisher$.format, config, "Extension")
  this$adjustConfigData(plotContainer$.plotSettings$.texts, config, "Show_Values")
  this$adjustConfigData(plotContainer$.plotSettings$.lines, config, "Draw_Lines")
  this$adjustConfigData(plotContainer$.theme$.legendPosition, config, "Legend_Position")
  this$adjustConfigData(plotContainer$.theme$.legendDirection, config, "Legend_Direction")
  this$adjustConfigData(plotContainer$.theme$.style, config, "Theme")
  this$adjustConfigData(plotContainer$.theme$.pointSize, config, "Point_Size")
  this$adjustConfigData(plotContainer$.theme$.lineSize, config, "Line_Size")
  this$adjustConfigData(plotContainer$.theme$.textSize, config, "Text_Size")
  this$adjustConfigData(plotContainer$.theme$.family, config, "Text_Font")
  this$adjustConfigData(plotContainer$.theme$.xTextSize, config, "X_Text_Size")
  this$adjustConfigData(plotContainer$.theme$.yTextSize, config, "Y_Text_Size")
  this$adjustConfigData(plotContainer$.theme$.xHjust, config, "X_Axis_Horizontal_Justice")
  this$adjustConfigData(plotContainer$.theme$.xVjust, config, "X_Axis_Vertical_Justice")
  this$adjustConfigData(plotContainer$.theme$.yHjust, config, "Y_Axis_Horizontal_Justice")
  this$adjustConfigData(plotContainer$.theme$.yVjust, config, "Y_Axis_Vertical_Justice")
  this$adjustConfigData(publisher$.automaticFilename, config, "Automatic_Filename")
  this$adjustConfigData(publisher$.filename, config, "Specified_Filename")
  this$adjustConfigData(publisher$.diagramWidth, config, "Diagram_Width")
  this$adjustConfigData(publisher$.diagramHeight, config, "Diagram_Height")
  this$adjustConfigData(publisher$.diagramDPI, config, "Diagram_DPI")
})


setMethodS3(name = "adjustConfigData", class = "ConfigurationSerializer", private = TRUE, function(this, data, configuration, key){
  if (key %in% names(configuration)){
    data <- configuration[[key]]
  }
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