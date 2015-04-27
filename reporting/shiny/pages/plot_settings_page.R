output$titleTemplate <- renderUI({
  isolate({
    selectInput("titleTemplate", "Templates",
                choices=values$templates)
  })
})