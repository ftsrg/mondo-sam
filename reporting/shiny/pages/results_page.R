output$plot <- renderPlot({
  # add dependency to "Draw Plot" button
  input$visualize
  isolate({
    if (is.null(input$metrics) | is.null(input$phases) | is.null(input$scenario) | is.null(input$case))
      return(NULL)
    
    withProgress(message = 'Creating plot', value = 1.0, {
      frameID = getFrameID()
      frame <- values$subFrames[[frameID]]
      if (is.null(frame)){
        return()
      }
      
      if ("Size" %in% values$selections){
        size <- input$size
        if (size == ""){
          return()
        }
        frame <- subset(frame, Size == input$size)
      }
      if (input$metrics == ""){
        return()
      }
      if (input$phases == ""){
        return()
      }
      frame <- subset(frame, MetricName %in% input$metrics & PhaseName %in% input$phases)
      legend <- input$legend
      frame <- frame[which(frame[[legend]] %in% input$legendFilters), ]
      if (values$iterations[1] > 0){
        frame <- subset(frame, Iteration >= values$iterations[1] & Iteration <= values$iterations[2])
      }
      print(nrow(frame))
      settings <- PlotSettings()
      
      settings <- setLegend(settings, legend)
      title <- injectValues(frame, input$title)
      settings <- setTitle(settings, title)
      settings <- setDimensions(settings, input$xdimension, "MetricValue")
      settings <- setLabels(settings, input$xlabel, input$ylabel)
      settings <- setAxis(settings, input$xaxis, input$yaxis)
      settings <- setYScale(settings, input$yscale)
      settings <- showTexts(settings, input$showValues)
      settings <- drawLines(settings, input$drawLines)
      
      frame$MetricValue <- frame$MetricValue * (10 ** input$yscale)
      
#       phases <- config$Plot[row, ]$Summarize_Function
#       phases <- list(input$phase)
#       extensions <- config$Plot[row, ]$Extensions
      extensions <- list("png")
#       filename <- paste(filename, "Function", row, sep="-")

      mappingPath <<- "../mapping.json"
      plot <- generatePlot(frame, settings, input$phases)
      print(plot)
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