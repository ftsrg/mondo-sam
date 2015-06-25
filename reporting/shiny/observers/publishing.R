# observer for changing the filename
appendFilename <- observe({
  # create dependency to the publishInsert button
  if (is.null(input$publishInsert)){
    return()
  }
  if (input$publishInsert == 0){
    return()
  }
  isolate({
    if (!is.null(input$publishTemplate)){
      publishTemplate <- toupper(input$publishTemplate)
      oldFilename <- input$filename
      if (!is.null(values$publisher)){
        values$publisher$.defaultFilename <- paste(oldFilename, publishTemplate, sep = '')
      }
      updateTextInput(session, "filename", value = paste(oldFilename, publishTemplate, sep = ''))
    }
  })
})


changeAutomaticFilename <- observe({
  value <- input$automaticFilename
  isolate({
    if (!is.null(values$publisher)){
      values$publisher$.automaticFilename <- value
    }
  })
})


changeFilename <- observe({
  value <- input$filename
  isolate({
    if (!is.null(values$publisher)){
      values$publisher$.defaultFilename <- value
    }
  })
})


changeFormat <- observe({
  value <- input$format
  isolate({
    if (!is.null(values$publisher)){
      values$publisher$.format <- value
    }
  })
})


changeDiagramWidth <- observe({
  value <- input$diagramWidth
  isolate({
    if (!is.null(values$publisher)){
      values$publisher$.diagramWidth <- value
    }
  })
})


changeDiagramHeight <- observe({
  value <- input$diagramHeight
  isolate({
    if (!is.null(values$publisher)){
      values$publisher$.diagramHeight <- value
    }
  })
})


changeDiagramDPI <- observe({
  value <- input$diagramDPI
  isolate({
    if (!is.null(values$publisher)){
      values$publisher$.diagramDPI <- value
    }
  })
})

# observer for publishing, saving plots 
publish <- observe({
  # create dependency to publish button
  if(input$publish == 0){
    return()
  }
  isolate({
    location <- input$location
    if (is.na(file.info(location)[1,"isdir"])){
      return()
    }
    withProgress(message = 'Publish Plots', value = 1.0, {
      values$publisher$.location <- location
      values$publisher$publish(values$filterContainer, values$plotContainer, input$publishFilter)
    })
  })
})
