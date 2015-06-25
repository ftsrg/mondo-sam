changeScenario <- observe({
  scenario <- input$scenario
  isolate({
    if (!is.null(values$filterContainer$.scenario)){
      values$filterContainer$.scenario$.selectedState <- scenario
      values$filterContainer$.scenario$notifyView(values)  
      values$filterContainer$.scenario$notifyNextView(values)
      values$filterContainer$.scenario$updateNext()
    }
  })
})


changeTool <- observe({
  tool <- input$tool
  isolate({
    if (!is.null(values$filterContainer$.tool)){
      values$filterContainer$.tool$.selectedState <- tool
      values$filterContainer$.tool$notifyView(values)
      values$filterContainer$.tool$notifyNextView(values)
      values$filterContainer$.tool$updateNext()
    }
  })
})


changeCase <- observe({
  case <- input$case
  isolate({
    if (!is.null(values$filterContainer$.case)){
      values$filterContainer$.case$.selectedState <- case
      values$filterContainer$.case$notifyView(values)
      values$filterContainer$.case$notifyNextView(values)
      values$filterContainer$.case$updateNext()
    }
  })
})


changeSize <- observe({
  size <- input$size
  isolate({
    if (!is.null(values$filterContainer$.size)){
      values$filterContainer$.size$.selectedState <- size
      values$filterContainer$.size$notifyView(values)
      values$filterContainer$.size$notifyNextView(values)
      values$filterContainer$.size$updateNext()
    }
  })
})


changePhases <- observe({
  phases <- input$phases
  isolate({
    if (!is.null(values$filterContainer$.phase)){
      values$filterContainer$.phase$.selectedState <- phases
      values$filterContainer$.phase$notifyView(values)
      values$filterContainer$.phase$notifyNextView(values)
      values$filterContainer$.phase$updateNext()
    }
  })
})


changeMetrics <- observe({
  metrics <- input$metrics
  isolate({
    if (!is.null(values$filterContainer$.metric)){
      values$filterContainer$.metric$.selectedState <- metrics
      values$filterContainer$.metric$notifyView(values)
      values$filterContainer$.metric$notifyNextView(values)
      values$filterContainer$.metric$updateNext()
    }
  })
})


changeSelections <- observe({
  xDimension <- input$xDimension
  legend <- input$legend
  isolate({
    if (!is.null(values$filterContainer$.xDimension)){
      values$filterContainer$.xDimension$setState(xDimension)
      values$filterContainer$.legend$setState(legend)
      values$filterContainer$.selections$changeSelections(xDimension, legend)
      
#       values$filterContainer$.publishing$update()
      
      values$filterContainer$updateFilters(values)
      values$filterContainer$notifyViews(values)
    }
  })
})


changeLegendFilters <- observe({
  specificLegend <- input$legendFilters
  isolate({
    if (!is.null(values$filterContainer$.specificLegend)){
      values$filterContainer$.specificLegend$.selectedState <- specificLegend
      values$filterContainer$.specificLegend$notifyView(values)
      values$filterContainer$.specificLegend$notifyNextView(values)
      values$filterContainer$.specificLegend$updateNext()
    }
  })
})


changeIteration <- observe({
  iterations <- input$iteration
  isolate({
    if (!is.null(values$filterContainer$.iteration)){
      values$filterContainer$.iteration$.selectedState <- iterations
      values$filterContainer$.iteration$notifyView(values)
      values$filterContainer$.iteration$notifyNextView(values)
      values$filterContainer$.iteration$updateNext()
    }
  })
})