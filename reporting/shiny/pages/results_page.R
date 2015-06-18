output$plot <- renderPlot({
  # add dependency to "Draw Plot" button
  input$visualize
  isolate({
    if (is.null(values$filterContainer$.specificLegend$.selectedState)){
      return(NULL)
    }
    
    withProgress(message = 'Creating plot', value = 1.0, {
      plot <- values$plotContainer$createPlot(values$filterContainer)
      print(plot)
#       settings <- PlotSettings()
#       
#       settings <- setLegend(settings, legend)
#       title <- injectValues(frame, input$title)
#       settings <- setTitle(settings, title)
#       settings <- setDimensions(settings, input$xdimension, "MetricValue")
#       settings <- setLabels(settings, input$xlabel, input$ylabel)
#       settings <- setAxis(settings, input$xaxis, input$yaxis)
#       settings <- setYScale(settings, input$yscale)
#       settings <- showTexts(settings, input$showValues)
#       settings <- drawLines(settings, input$drawLines)
      
#       phases <- config$Plot[row, ]$Summarize_Function
#       phases <- list(input$phase)
#       extensions <- config$Plot[row, ]$Extensions
#       extensions <- list("png")
#       filename <- paste(filename, "Function", row, sep="-")

#       mappingPath <<- "../mapping.json"

#       plot <- generatePlot(frame, settings, input$phases)
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