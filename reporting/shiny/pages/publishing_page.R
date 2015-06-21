output$cwd <- renderText({
  return(getwd())
})


output$filename <- renderUI({
  enable <- input$automaticFilename
  if (!enable){
    textInput("filename", label = "Filename", value = "CASENAME-SCENARIO")
  }
})


output$publishGroup <- renderUI({
  checkboxGroupInput("publishGroup", label = "Publish Settings",
                   choices = list("All Scenarios" = "scenarios", "All Cases" = "cases"))
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
    if (!file.exists(input$location)){
      return("Location does not exist")
    }
    else {
      return()
    }
  })
  
})