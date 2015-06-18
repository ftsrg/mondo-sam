changeScenario <- observe({
  scenario <- input$scenario
  isolate({
    values$filterContainer$.scenario$.selectedState <- scenario
    values$filterContainer$.scenario$notify(values)  
  })
  
})

changeTool <- observe({
  tool <- input$tool
  isolate({
    values$filterContainer$.tool$.selectedState <- tool
    values$filterContainer$.tool$notify(values)
  })
})

changeCase <- observe({
  case <- input$case
  isolate({
    values$filterContainer$.case$.selectedState <- case
    values$filterContainer$.case$notify(values)
  })
})

changeSize <- observe({
  size <- input$size
  isolate({
    values$filterContainer$.size$.selectedState <- size
    values$filterContainer$.size$notify(values)
  })
})


changePhases <- observe({
  phases <- input$phases
  isolate({
    values$filterContainer$.phase$.selectedState <- phases
    values$filterContainer$.phase$notify(values)
  })
})

changeMetrics <- observe({
  metrics <- input$metrics
  isolate({
    values$filterContainer$.metric$.selectedState <- metrics
    values$filterContainer$.metric$notify(values)
  })
})

changeSelections <- observe({
  xDimension <- input$xDimension
  legend <- input$legend
  isolate({
    values$filterContainer$.xDimension$setState(xDimension)
    values$filterContainer$.legend$setState(legend)
    values$filterContainer$.selections$changeSelections(xDimension, legend)
    values$filterContainer$notifyFilters(values)
  })
})


changeLegendFilters <- observe({
  specificLegend <- input$legendFilters
  isolate({
    values$filterContainer$.specificLegend$.selectedState <- specificLegend
    values$filterContainer$.specificLegend$notify(values)
  })
})


changeIteration <- observe({
  iterations <- input$iteration
  isolate({
    values$filterContainer$.iteration$.selectedState <- iterations
    values$filterContainer$.iteration$notify(values)
  })
})

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