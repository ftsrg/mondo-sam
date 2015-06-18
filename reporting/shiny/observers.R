changeScenario <- observe({
  print("scen observ")
  scenario <- input$scenario
  isolate({
    
    values$filterContainer$.scenario$.selectedState <- scenario
    values$filterContainer$.scenario$notify(values)  
  })
  
})

changeCase <- observe({
  values$case <- input$case
})

changeTool <- observe({
  values$tool <- input$tool
})

changeSize <- observe({
  values$size <- input$size
})

changePhases <- observe({
  print("phases obs")
  values$phases <- input$phases
})

changeMetrics <- observe({
  print("metrics obs")
  values$metrics <- input$metrics
})

changeXDimension <- observe({
  print("xdim obs")
  values$xDimension <- input$xdimension
})

changeLegend <- observe({
  print("legend changed obs")
  values$selectedLegend <- input$legend
})

changeLegendFilters <- observe({
  print("legend filter obs")
  values$legendFilters <- input$legendFilters
})

changeIteration <- observe({
  print("iter obs")
  if (is.null(input$iteration))
    return()
  values$iterations <- input$iteration
  
})

changeSelections <- observe({
  print("change selections observer")
  # add dependencies
  input$xdimension
  input$legend
  
  isolate({
    values$selections <- values$defaultSelections
    values$selections <- values$selections[values$selections != input$legend & 
                                             values$selections != input$xdimension]
  })
  print(values$selections)
})
