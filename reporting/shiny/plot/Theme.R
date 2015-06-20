setConstructorS3(name = "Theme", function(){
  extend(Object(), "Theme",
         .style = NULL,
         .styleDefault = NULL,
         .family = NULL,
         .familyDefault = NULL,
         .textSize = NULL,
         .textSizeDefault = NULL,
         .xTextSize = NULL,
         .yTextSize = NULL,
         .xHjust = NULL,
         .yHjust = NULL,
         .xVjust = NULL,
         .yVjust = NULL,
         .legendPosition = NULL,
         .legendDirection = NULL
         )
})


setMethodS3(name = "init", class = "Theme", function(this){
  this$.styleDefault <- "sam"
  this$.style <- this$.styleDefault
  this$.familyDefault <- "Helvetica"
  this$.family <- this$.familyDefault
  this$.textSizeDefault <- 16
  this$.textSize <- this$.textSizeDefault
  this$.xTextSize <- 13
  this$.yTextSize <- 13
  this$.xHjust <- 0.5
  this$.yHjust <- 1
  this$.xVjust <- 0
  this$.yVjust <- 0.5
  this$.legendPosition <- "bottom"
  this$.legendDirection <- "vertical"
})


setMethodS3(name = "getTheme", class = "Theme", function(this){
  if (this$.style == "specific"){
    theme <- theme(text = element_text(family = this$.family, size = this$.textSize),
                   panel.background = element_rect(fill = "#FFFFFF"),
                   legend.position = this$.legendPosition,
                   legend.direction = this$.legendDirection,
                   panel.grid.major = element_line(size = 0.3, colour = "#333333"),
                   panel.grid.minor = element_line(size = 0.15, colour = "#CCCCCC"),
                   axis.text.x = element_text(colour = "black", size = this$.xTextSize, hjust = this$.xHjust, vjust = this$.xVjust),
                   axis.text.y = element_text(colour = "black", size = this$.yTextSize, hjust = this$.yHjust, vjust = this$.yVjust)
    )
  }
  else if (this$.style == "r"){
    theme <- theme_grey()
  }
  else if (this$.style == "black"){
    theme <- theme_bw()
  }
  else {
    theme <- theme(text = element_text(family = this$.familyDefault, size = this$.textSizeDefault),
                   panel.background = element_rect(fill="#FFFFFF"),
                   legend.position = this$.legendPosition,
                   legend.direction = this$.legendDirection,
                   panel.grid.major = element_line(size = 0.3, colour = "#333333"),
                   panel.grid.minor = element_line(size = 0.15, colour = "#CCCCCC"),
                   axis.text.x = element_text(colour = "black"),
                   axis.text.y = element_text(colour = "black")
    )
  }
  return(theme)
})
