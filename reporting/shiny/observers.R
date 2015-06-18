changeScenario <- observe({
  print("scen observ")
  scenario <- input$scenario
  isolate({
    values$filterContainer$.scenario$.selectedState <- scenario
    values$filterContainer$.scenario$notify(values)  
  })
  
})

changeTool <- observe({
  print("tool observer")
  tool <- input$tool
  isolate({
    values$filterContainer$.tool$.selectedState <- tool
    values$filterContainer$.tool$notify(values)
  })
})

changeCase <- observe({
  print("case observer")
  case <- input$case
  isolate({
    values$filterContainer$.case$.selectedState <- case
    values$filterContainer$.case$notify(values)
  })
})

changeSize <- observe({
  print("size observer")
  size <- input$size
  isolate({
    values$filterContainer$.size$.selectedState <- size
    values$filterContainer$.size$notify(values)
  })
})


changePhases <- observe({
  print("phase observer")
  phases <- input$phases
  isolate({
    values$filterContainer$.phase$.selectedState <- phases
    values$filterContainer$.phase$notify(values)
  })
})

changeMetrics <- observe({
  print("metrics obs")
  values$metrics <- input$metrics
})

changeSelections <- observe({
  print("change selections obs")
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
  print("legend filter obs")
  values$legendFilters <- input$legendFilters
})

changeIteration <- observe({
  print("iter obs")
  if (is.null(input$iteration))
    return()
  values$iterations <- input$iteration
  
})

# changeSelections <- observe({
#   print("change selections observer")
#   # add dependencies
#   input$xdimension
#   input$legend
#   
#   isolate({
#     values$selections <- values$defaultSelections
#     values$selections <- values$selections[values$selections != input$legend & 
#                                              values$selections != input$xdimension]
#   })
#   print(values$selections)
# })
