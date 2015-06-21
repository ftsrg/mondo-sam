# observer for the filename
changeFilename <- observe({
  # create dependency to the publishInsert button
  if (input$publishInsert == 0){
    return()
  }
  isolate({
    publishTemplate <- toupper(input$publishTemplate)
    oldFilename <- input$filename
    updateTextInput(session, "filename", value = paste(oldFilename, publishTemplate, sep = ''))
  })
})