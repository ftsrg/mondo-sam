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
    write(values$serializer$convertToJSON(input, values$plotContainer, values$filterContainer), file = file)
  },
  contentType = "application/json"
)