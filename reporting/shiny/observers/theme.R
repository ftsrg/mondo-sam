changeThemeStyle <- observe({
  style <- input$theme
  isolate({
    values$plotContainer$.theme$.style <- style
  })
})


changeThemeLegendPosition <- observe({
  position <- input$legendPosition
  isolate({
    values$plotContainer$.theme$.legendPosition <- position
  })
})


changeThemeLegendDirection <- observe({
  direction <- input$legendDirection
  isolate({
    values$plotContainer$.theme$.legendDirection <- direction
  })
})


changeThemePointSize <- observe({
  size <- input$pointSize
  isolate({
    values$plotContainer$.theme$.pointSize <- size
  })
})


changeThemeLineSize <- observe({
  size <- input$lineSize
  isolate({
    values$plotContainer$.theme$.lineSize <- size
  })
})


changeThemeTextSize <- observe({
  size <- input$textSize
  isolate({
    values$plotContainer$.theme$.textSize <- size
  })
})


changeThemeXTextSize <- observe({
  size <- input$xTextSize
  isolate({
    values$plotContainer$.theme$.xTextSize <- size
  })
})


changeThemeYTextSize <- observe({
  size <- input$yTextSize
  isolate({
    values$plotContainer$.theme$.yTextSize <- size
  })
})


changeThemeTextFont <- observe({
  font <- input$textFont
  isolate({
    values$plotContainer$.theme$.family <- font
  })
})


changeThemeXHjust <- observe({
  just <- input$xHjust
  isolate({
    values$plotContainer$.theme$.xHjust <- just
  })
})


changeThemeYHjust <- observe({
  just <- input$yHjust
  isolate({
    values$plotContainer$.theme$.yHjust <- just
  })
})


changeThemeXVjust <- observe({
  just <- input$xVjust
  isolate({
    values$plotContainer$.theme$.xVjust <- just
  })
})


changeThemeYVjust <- observe({
  just <- input$yVjust
  isolate({
    values$plotContainer$.theme$.yVjust <- just
  })
})