# observer for changing the filename
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
      if (input$automaticFilename){
        time <- format(Sys.time())
        time <- gsub(pattern = " ", replacement = "_", time)
        time <- gsub(pattern = ":", replacement = "_", time)
        time <- gsub(pattern = "-", replacement = "_", time)
        selections <- ""
        for (s in values$filterContainer$.selections$.selections){
          selections <- paste(selections, s, sep = "_")
        }
        filename <- paste(time, toupper(selections), sep = "")
      }
      else {
        filename <- input$filename
      }
      
      format <- input$format
      file <- paste(filename, ".", tolower(format), sep='')
      
      plot <- values$plotContainer$createPlot(values$filterContainer)
      if (is.null(plot)){
        return()
      }
      
      ggsave(plot, filename = file, , path = location, width = input$diagramWidth, 
             height = input$diagramHeight, dpi = input$diagramDPI, )
    })
  })
})