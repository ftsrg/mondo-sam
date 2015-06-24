setConstructorS3(name = "ConfigurationSerializer", function(){
  extend(Object(), "ConfigurationSerializer",
         .jsonData = NULL,
         .filterContainer = NULL,
         .plotContainer = NULL,
         .publisher = NULL)
})


setMethodS3(name = "export", class = "ConfigurationSerializer", function(this, file){
  write(this$.jsonData, file = file)
})


setMethodS3(name = "import", class = "ConfigurationSerializer", function(this, config){
  this$.filterContainer$import(config)
  this$.plotContainer$import(config)
  this$.publisher$import(config)
})


setMethodS3(name = "convertToJSON", class = "ConfigurationSerializer", function(this, plotContainer, filterContainer, publisher){
  if (is.null(plotContainer$.plotSettings)){
    data <- ""
  }
  else {
    data <- list(
      "Plot" = list(
        c(
          filterContainer$export(),
          plotContainer$export(),
          publisher$export()
        )
      )
    )
  }
  
  this$.jsonData <- toJSON(data, 
                           pretty = T, 
                           auto_unbox = T, 
                           factor = "string", 
                           null = "null", 
                           na = "null")
  return(this$.jsonData)
})