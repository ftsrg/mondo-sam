output$cwd <- renderText({
  return(getwd())
})


output$filename <- renderUI({
  enable <- input$automaticFilename
  if (!enable){
    textInput("filename", label = "Filename", value = "CASENAME-SCENARIO")
  }
})


output$publishFilter <- renderUI({
  values$publishingObserver
  
  isolate({
    if (is.null(values$filterContainer$.publishing)){
      return()
    }
    values$filterContainer$.publishing$display()
  })
})


output$publishTemplate <- renderUI({
  enable <- input$automaticFilename
  if (!enable){
    isolate({
      selectInput("publishTemplate", "Templates",
                  choices=values$templates)
    })
  }
})


output$publishInsert <- renderUI({  
  enable <- input$automaticFilename
  if (!enable){
    actionButton("publishInsert", label = "Insert Filename")
  }
})


output$response <- renderText({
  input$publish
  isolate({
    if (is.na(file.info(input$location)[1,"isdir"])){
      return("Location does not exist")
    }
    else {
      return()
    }
  })
  
})