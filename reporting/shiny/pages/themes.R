output$theme <- renderUI({
  selectInput("theme", label="Themes",
              choices = c("R Default" = "r", "Black and White" = "black", "MONDO-SAM Default" = "sam", "Specific" = "specific"),
              selected = "sam")
})


output$legendPosition <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    position <- values$plotContainer$.theme$.legendPosition
    if (is.null(position)){
      return()
    }
    if (theme %in% c("sam", "specific")){
      selectInput("legendPosition", label="Legend Position",
                  c("Top" = "top", "Right" = "right", "Bottom" = "bottom", "Left" = "left"),
                  selected = position)
    }
    else {
      return()
    }
  })
})


output$legendDirection <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    direction <- values$plotContainer$.theme$.legendDirection
    if (is.null(direction)){
      return()
    }
    if (theme %in% c("sam", "specific")){
      selectInput("legendDirection", label="Legend Direction",
                  c("Vertical" = "vertical", "Horizontal" = "horizontal"),
                  selected = direction)
    }
  })
})


output$textSize <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    size <- values$plotContainer$.theme$.textSize
    if (is.null(size)){
      return()
    }
    if (theme == "specific"){
      sliderInput("textSize", label="Text Size",
                   value = size, min = 1, max = 30, step = 1)
    }
  })
})


output$textFont <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    font <- values$plotContainer$.theme$.family
    if (is.null(font)){
      return()
    }
    if (theme == "specific"){
      selectInput("textFont", label="Text Font",
                  c("Times", "Helvetica", "Bookman", "AvantGarde", "Courier", "NewCenturySchoolbook", "Palatino"),
                  selected = font)
    }
  })
})


output$xTextSize <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    size <- values$plotContainer$.theme$.xTextSize
    if (is.null(size)){
      return()
    }
    if (theme == "specific"){
      sliderInput("xTextSize", label="X-Axis Text Size",
                   value = size, min = 1, max = 30, step = 1)
    }
  })
})


output$yTextSize <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    size <- values$plotContainer$.theme$.yTextSize
    if (is.null(size)){
      return()
    }
    if (theme == "specific"){
      sliderInput("yTextSize", label="Y-Axis Text Size",
                   value = size, min = 1, max = 30, step = 1)
    }
  })
})


output$xHjust <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    size <- values$plotContainer$.theme$.xHjust
    if (is.null(size)){
      return()
    }
    if (theme == "specific"){
      sliderInput("xHjust", label="X-Axis Horizontal Justification",
                  value = size, min = 0, max = 1, step = 0.05)
    }
  })
})


output$yHjust <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    size <- values$plotContainer$.theme$.yHjust
    if (is.null(size)){
      return()
    }
    if (theme == "specific"){
      sliderInput("yHjust", label="Y-Axis Horizontal Justification",
                  value = size, min = 0, max = 1, step = 0.05)
    }
  })
})


output$xVjust <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    size <- values$plotContainer$.theme$.xVjust
    if (is.null(size)){
      return()
    }
    if (theme == "specific"){
      sliderInput("xVjust", label="X-Axis Vertical Justification",
                  value = size, min = 0, max = 1, step = 0.05)
    }
  })
})


output$yVjust <- renderUI({
  theme <- input$theme
  if (is.null(theme)){
    return()
  }
  isolate({
    size <- values$plotContainer$.theme$.yVjust
    if (is.null(size)){
      return()
    }
    if (theme == "specific"){
      sliderInput("yVjust", label="Y-Axis Vertical Justification",
                  value = size, min = 0, max = 1, step = 0.05)
    }
  })
})