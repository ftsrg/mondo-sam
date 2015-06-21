changePlotSettingsLegend <- observe({
  legend <- input$legend
  isolate({
    values$plotContainer$.plotSettings$.legend <- legend
  })
})


changePlotSettingsXDimension <- observe({
  dim <- input$xDimension
  isolate({
    values$plotContainer$.plotSettings$.xDimension <- dim
  })
})


changePlotSettingsYScale <- observe({
  scale <- input$yScale
  isolate({
    values$plotContainer$.plotSettings$.yScale <- scale
  })
})


changePlotSettingsXLabel <- observe({
  label <- input$xLabel
  isolate({
    values$plotContainer$.plotSettings$.xLabel <- label
  })
})


changePlotSettingsYLabel <- observe({
  label <- input$yLabel
  isolate({
    values$plotContainer$.plotSettings$.yLabel <- label
  })
})


changePlotSettingsXAxis <- observe({
  axis <- input$xAxis
  isolate({
    values$plotContainer$.plotSettings$.xAxis <- axis
  })
})


changePlotSettingsYAxis <- observe({
  axis <- input$yAxis
  isolate({
    values$plotContainer$.plotSettings$.yAxis <- axis
  })
})


changePlotSettingsTexts <- observe({
  enableTexts <- input$showValues
  isolate({
    values$plotContainer$.plotSettings$.texts <- enableTexts
  })
})


changePlotSettingsLines <- observe({
  drawLines <- input$drawLines
  isolate({
    values$plotContainer$.plotSettings$.lines <- drawLines
  })
})


changePlotSettingsTitle <- observe({
  title <- input$title
  isolate({
    values$plotContainer$.plotSettings$.title <- title
  })
})

# observer for title
appendTitle <- observe({
  # create dependency to the titleInsert button
  if (input$titleInsert == 0){
    return()
  }
  isolate({
    titleTemplate <- toupper(input$titleTemplate)
    oldTitle <- input$title
    updateTextInput(session, "title", value = paste(oldTitle, titleTemplate))
  })
})