changeScenario <- observe({
  scenario <- input$scenario
  isolate({
    if (!is.null(values$filterContainer$.scenario)){
      values$filterContainer$.scenario$.selectedState <- scenario
      values$filterContainer$.scenario$notify(values)  
    }
  })
})


changeTool <- observe({
  tool <- input$tool
  isolate({
    if (!is.null(values$filterContainer$.tool)){
      values$filterContainer$.tool$.selectedState <- tool
      values$filterContainer$.tool$notify(values)
    }
  })
})


changeCase <- observe({
  case <- input$case
  isolate({
    if (!is.null(values$filterContainer$.case)){
      values$filterContainer$.case$.selectedState <- case
      values$filterContainer$.case$notify(values)
    }
  })
})


changeSize <- observe({
  size <- input$size
  isolate({
    if (!is.null(values$filterContainer$.size)){
      values$filterContainer$.size$.selectedState <- size
      values$filterContainer$.size$notify(values)
    }
  })
})


changePhases <- observe({
  phases <- input$phases
  isolate({
    if (!is.null(values$filterContainer$.phase)){
      values$filterContainer$.phase$.selectedState <- phases
      values$filterContainer$.phase$notify(values)
    }
  })
})


changeMetrics <- observe({
  metrics <- input$metrics
  isolate({
    if (!is.null(values$filterContainer$.metric)){
      values$filterContainer$.metric$.selectedState <- metrics
      values$filterContainer$.metric$notify(values)
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
      
      values$filterContainer$.publishing$update()
      
      values$filterContainer$notifyFilters(values)
    }
  })
})


changeLegendFilters <- observe({
  specificLegend <- input$legendFilters
  isolate({
    if (!is.null(values$filterContainer$.specificLegend)){
      values$filterContainer$.specificLegend$.selectedState <- specificLegend
      values$filterContainer$.specificLegend$notify(values)
    }
  })
})


changeIteration <- observe({
  iterations <- input$iteration
  isolate({
    if (!is.null(values$filterContainer$.iteration)){
      values$filterContainer$.iteration$.selectedState <- iterations
      values$filterContainer$.iteration$notify(values)
    }
  })
})