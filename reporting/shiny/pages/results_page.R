output$plot <- renderPlot({
  # add dependency to "Draw Plot" button
  input$visualize
  isolate({
    if (is.null(values$filterContainer$.specificLegend$.selectedState)){
      return(NULL)
    }
    
    withProgress(message = 'Creating plot', value = 1.0, {
      plot(values$plotContainer$createPlot(values$filterContainer))
    })
  })
})


output$scenario <- renderUI({
  values$scenarioObserver
  isolate({
    if (!is.null(values$filterContainer$.scenario)){
      values$filterContainer$.scenario$display()  
    }
  })
})


output$tool <- renderUI({
  values$toolObserver
  isolate({
    if (!is.null(values$filterContainer$.tool)){
      values$filterContainer$.tool$display()  
    }
  })
})


output$case <- renderUI({
  values$caseObserver
  isolate({
    if (!is.null(values$filterContainer$.case)){
      values$filterContainer$.case$display()
    }
  })
})


output$size <- renderUI({
  values$sizeObserver
  isolate({
    if (!is.null(values$filterContainer$.size)){
      values$filterContainer$.size$display()
    }
  })
})


output$phases <- renderUI({
  values$phaseObserver
  isolate({
    if (!is.null(values$filterContainer$.phase)){
      values$filterContainer$.phase$display()
    }
  })
})


output$metrics <- renderUI({
  values$metricObserver
  isolate({
    if (!is.null(values$filterContainer$.metric)){
      values$filterContainer$.metric$display()
    }
  })
})


output$iteration <- renderUI({
  values$iterationObserver
  isolate({
    if (!is.null(values$filterContainer$.iteration)){
      values$filterContainer$.iteration$display()
    }
  })
})