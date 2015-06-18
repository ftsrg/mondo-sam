setConstructorS3(name = "Theme", function(){
  extend(Object(), "Theme",
         .family = "Helvetica",
         .textSize = 16,
         .legendPosition = "bottom",
         .legendDirection = "vertical"
         )
})


setMethodS3(name = "getTheme", class = "Theme", function(this){
  bwTheme <- theme(text=element_text(family=this$.family, size=this$.textSize),
                   panel.background = element_rect(fill="#FFFFFF"),
                   legend.position=this$.legendPosition,
                   legend.direction=this$.legendDirection,
                   panel.grid.major = element_line(size=0.3, colour="#333333"),
                   panel.grid.minor = element_line(size=0.15, colour="#CCCCCC"),
                   axis.text.x = element_text(colour="black"),
                   axis.text.y = element_text(colour="black")
  )
  return(bwTheme)
})