setConstructorS3(name = "Publisher", function(){
  extend(Object(), "Publisher",
         .automaticFilename = NULL,
         .filename = NULL,
         .defaultFilename = NULL,
         .format = NULL,
         .location = NULL,
         .time = NULL,
         .diagramWidth = NULL,
         .diagramHeight = NULL,
         .diagramDPI = NULL)
})


setMethodS3(name = "publish", class = "Publisher", function(this, filterContainer, plotContainer, publishFilters){
  if (length(publishFilters) == 0){
    this$publishOne(filterContainer, plotContainer)
  }
  else {
    for (f in publishFilters){
      filter <- filterContainer$getFilter(f)
      filter$storeState()
    }
    
    this$publishAll(publishFilters, filterContainer, plotContainer)
    
    for (f in publishFilters){
      filter <- filterContainer$getFilter(f)
      filter$popState()
    }
  }
})


setMethodS3(name = "publishOne", class = "Publisher", private = TRUE, function(this, filterContainer, plotContainer){
  plot <- plotContainer$createPlot(filterContainer)
  if (is.null(plot)){
    return()
  }
  this$determineFilename(filterContainer)
  
  ggsave(plot, filename = this$.filename, path = this$.location, width = this$.diagramWidth, 
         height = this$.diagramHeight, dpi = this$.diagramDPI)
})


setMethodS3(name = "publishAll", class = "Publisher", private = TRUE, function(this, publishFilters, filterContainer, plotContainer){
  if (length(publishFilters) == 0){
    plot <- plotContainer$createPlot(filterContainer)
    if (is.null(plot)){
      return()
    }
    
    this$determineFilename(filterContainer)
    
    ggsave(plot, filename = this$.filename, , path = this$.location, width = this$.diagramWidth, 
           height = this$.diagramHeight, dpi = this$.diagramDPI, )
  }
  else {
    for (f in publishFilters){
      filter <- filterContainer$getFilter(f)
      for (state in filter$.allCurrentStates){
        filter$.selectedState <- state
        newFilters <- publishFilters[publishFilters != f]
        this$publishAll(newFilters, filterContainer, plotContainer)
      }
    }
  }
})


setMethodS3(name = "determineFilename", class = "Publisher", private = TRUE, function(this, filterContainer){
  if (this$.automaticFilename){
    time <- format(Sys.time())
    time <- gsub(pattern = " ", replacement = "_", time)
    time <- gsub(pattern = ":", replacement = "_", time)
    time <- gsub(pattern = "-", replacement = "_", time)
    selections <- ""
    for (s in filterContainer$.selections$.selections){
      selections <- paste(selections, s, sep = "_")
    }
    this$.filename <- paste(time, toupper(selections), sep = "")
  }
  else {
    this$.filename <- this$.defaultFilename
  }
  this$.filename <- filterContainer$injectStates(this$.filename)
  this$.filename <- paste(this$.filename, ".", tolower(this$.format), sep='')
})