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
  this$.filterContainer$.xDimension$.selectedState <- this$updateConfigData(this$.filterContainer$.xDimension$.selectedState, config, "X_Dimension")
  this$.filterContainer$.legend$.selectedState <- this$updateConfigData(this$.filterContainer$.legend$.selectedState, config, "Legend")
  this$.filterContainer$.specificLegend$.selectedState <- this$updateConfigData(this$.filterContainer$.specificLegend$.selectedState, config, "Legend_Filters")
  legend <- this$.filterContainer$.specificLegend$.selectedState
  if (is.null(legend) | is.na(legend)){
    this$.filterContainer$.specificLegend$.selectedState <- unique(this$.filterContainer$.result$.frame[[this$.filterContainer$.legend$.selectedState]])
  }
  this$.filterContainer$.phase$.selectedState <- this$updateConfigData(this$.filterContainer$.phase$.selectedState, config, "Summarize_Function")
  this$.plotContainer$.plotSettings$.title <- this$updateConfigData(this$.plotContainer$.plotSettings$.title, config, "Title")
  this$.filterContainer$.metric$.selectedState <- this$updateConfigData(this$.filterContainer$.metric$.selectedState, config, "Metrics")
  this$.plotContainer$.plotSettings$.yScale <- this$updateConfigData(this$.plotContainer$.plotSettings$.yScale, config, "Metric_Scale")
  this$.filterContainer$.iteration[1] <- this$updateConfigData(this$.filterContainer$.iteration[1], config, "Min_Iteration")
  this$.filterContainer$.iteration[2] <- this$updateConfigData(this$.filterContainer$.iteration[2], config, "Max_Iteration")
  this$.plotContainer$.plotSettings$.xLabel <- this$updateConfigData(this$.plotContainer$.plotSettings$.xLabel, config, "X_Label")
  this$.plotContainer$.plotSettings$.yLabel <- this$updateConfigData(this$.plotContainer$.plotSettings$.yLabel, config, "Y_Label")
  this$.plotContainer$.plotSettings$.xAxis <- this$updateConfigData(this$.plotContainer$.plotSettings$.xAxis, config, "X_Axis_Scale")
  this$.plotContainer$.plotSettings$.yAxis <- this$updateConfigData(this$.plotContainer$.plotSettings$.yAxis, config, "Y_Axis_Scale")
  this$.publisher$.format <- this$updateConfigData(this$.publisher$.format, config, "Extension")
  this$.plotContainer$.plotSettings$.texts <- this$updateConfigData(this$.plotContainer$.plotSettings$.texts, config, "Show_Values")
  this$.plotContainer$.plotSettings$.lines <- this$updateConfigData(this$.plotContainer$.plotSettings$.lines, config, "Draw_Lines")
  this$.plotContainer$.theme$.legendPosition <- this$updateConfigData(this$.plotContainer$.theme$.legendPosition, config, "Legend_Position")
  this$.plotContainer$.theme$.legendDirection <- this$updateConfigData(this$.plotContainer$.theme$.legendDirection, config, "Legend_Direction")
  this$.plotContainer$.theme$.style <- this$updateConfigData(this$.plotContainer$.theme$.style, config, "Theme")
  this$.plotContainer$.theme$.pointSize <- this$updateConfigData(this$.plotContainer$.theme$.pointSize, config, "Point_Size")
  this$.plotContainer$.theme$.lineSize <- this$updateConfigData(this$.plotContainer$.theme$.lineSize, config, "Line_Size")
  this$.plotContainer$.theme$.textSize <- this$updateConfigData(this$.plotContainer$.theme$.textSize, config, "Text_Size")
  this$.plotContainer$.theme$.family <- this$updateConfigData(this$.plotContainer$.theme$.family, config, "Text_Font")
  this$.plotContainer$.theme$.xTextSize <- this$updateConfigData(this$.plotContainer$.theme$.xTextSize, config, "X_Text_Size")
  this$.plotContainer$.theme$.yTextSize <- this$updateConfigData(this$.plotContainer$.theme$.yTextSize, config, "Y_Text_Size")
  this$.plotContainer$.theme$.xHjust <- this$updateConfigData(this$.plotContainer$.theme$.xHjust, config, "X_Axis_Horizontal_Justice")
  this$.plotContainer$.theme$.xVjust <- this$updateConfigData(this$.plotContainer$.theme$.xVjust, config, "X_Axis_Vertical_Justice")
  this$.plotContainer$.theme$.yHjust <- this$updateConfigData(this$.plotContainer$.theme$.yHjust, config, "Y_Axis_Horizontal_Justice")
  this$.plotContainer$.theme$.yVjust <- this$updateConfigData(this$.plotContainer$.theme$.yVjust, config, "Y_Axis_Vertical_Justice")
  this$.publisher$.automaticFilename <- this$updateConfigData(this$.publisher$.automaticFilename, config, "Automatic_Filename")
  this$.publisher$.defaultFilename <- this$updateConfigData(this$.publisher$.filename, config, "Specified_Filename")
  this$.publisher$.diagramWidth <- this$updateConfigData(this$.publisher$.diagramWidth, config, "Diagram_Width")
  this$.publisher$.diagramHeight <- this$updateConfigData(this$.publisher$.diagramHeight, config, "Diagram_Height")
  this$.publisher$.diagramDPI <- this$updateConfigData(this$.publisher$.diagramDPI, config, "Diagram_DPI")
})


setMethodS3(name = "updateConfigData", class = "ConfigurationSerializer", private = TRUE, function(this, oldData, configuration, key){
  if (key %in% names(configuration)){
    return(configuration[[key]])
  }
  else {
    return(oldData)
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