output$xDimension <- renderUI({
  values$xDimensionObserver
  if (!is.null(values$filterContainer$.xDimension)){
    values$filterContainer$.xDimension$display()
  }
})


output$legend <- renderUI({
  values$legendObserver
  if (!is.null(values$filterContainer$.legend)){
    values$filterContainer$.legend$display()
  }
})


output$legendFilters <- renderUI({
  values$specificLegendObserver
  if (!is.null(values$filterContainer$.specificLegend)){
    values$filterContainer$.specificLegend$display()
  }
})