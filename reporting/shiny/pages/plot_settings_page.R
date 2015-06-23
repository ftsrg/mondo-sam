output$titleTemplate <- renderUI({
  isolate({
    selectInput("titleTemplate", "Templates",
                choices=values$templates)
  })
})


output$exportConfiguration <- downloadHandler(
  filename = function() {
    paste("config", "json", sep = ".")
  },
  content = function(file) {
    write(values$serializer$convertToJSON(values$plotContainer, values$filterContainer, values$publisher), file = file)
  },
  contentType = "application/json"
)