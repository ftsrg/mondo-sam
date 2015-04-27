output$publishTemplate <- renderUI({
  isolate({
    selectInput("publishTemplate", "Templates",
                choices=values$templates)
  })
})