# observer for changing the filename
changeFilename <- observe({
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
      updateTextInput(session, "filename", value = paste(oldFilename, publishTemplate, sep = ''))
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
    if (!file.exists(location)){
      return()
    }
    withProgress(message = 'Publish Plots', value = 1.0, {
      values$publisher$.automaticFilename <- input$automaticFilename
      values$publisher$.defaultFilename <- input$filename
      values$publisher$.location <- location
      values$publisher$.format <- input$format
      values$publisher$.diagramWidth <-input$diagramWidth
      values$publisher$.diagramHeight <- input$diagramHeight
      values$publisher$.diagramDPI <- input$diagramDPI
      values$publisher$publish(values$filterContainer, values$plotContainer, input$publishFilter)
    })
  })
})
