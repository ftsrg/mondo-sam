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
  values$legendFilters <- input$legendFilters
})


changeIteration <- observe({
  iterations <- input$iteration
  isolate({
    values$filterContainer$.iteration$.selectedState <- iterations
    values$filterContainer$.iteration$notify(values)
  })
})