output$mix <- renderUI({
  if (is.null(input$xdimension)){
    return()
  }
  isolate({
    if (input$xdimension == "Size"){
      return(checkboxInput("mix", label = "Mix Phases", value = FALSE))
      if (is.null(input$mix) == FALSE){
        values$mix <- input$mix
      }  
    }
    else {
      values$mix <- FALSE
      # vanish widget
      return()
    }
  })
})

#   output$xdimension <- renderUI({
#     selectInput("xdimension", label="X Dimension",
#                 choices = c(values$selections), selected = "Size")
#   })
# 
#   output$legend <- renderUI({
#     selectInput("legend", label="Legend",
#                 choices = c(values$selections), selected = "Tool")
#   })