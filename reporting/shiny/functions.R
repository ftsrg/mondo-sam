source("themes.R")

createPlot <- function(results, settings, group, xDimension){
  tempResults <- results
  tempResults$MetricValue <- tempResults$MetricValue * (10**settings@yScale)
  if (settings@theme == "Default"){
    plot <- ggplot(tempResults, aes_string(x=xDimension, y="MetricValue")) + 
            scale_shape_manual(values=1:nlevels(tempResults$Tool)) +
            theme_grey() + geom_line(aes_string(group=group, colour=group)) + 
            geom_point(aes_string(shape=group, colour=group)) +
            xlab(settings@xLabel) +
            ylab(settings@yLabel) +
            ggtitle(label = settings@title)
  }
  else if (settings@theme == "Black and White"){
    plot <- ggplot(tempResults, aes_string(x=xDimension, y="MetricValue")) +
            scale_shape_manual(values=1:nlevels(tempResults$Tool)) +
            bwTheme + geom_line(aes_string(group=group)) + geom_point(aes_string(shape=group), size=3) + 
            xlab(settings@xLabel) +
            ylab(settings@yLabel) +
            ggtitle(label = settings@title)
  }
#   minSize <- min(tempResults$xDimension)
#   maxSize <- max(tempResults$xDimension)
  xElements <- unique(tempResults[[xDimension]])
  print(xElements)
  elementsCount <- length(xElements)
  if (settings@xAxis == "Continuous"){
    plot <- plot + scale_x_continuous(breaks = c(xElements), labels = c(xElements))
  }
  else if (settings@xAxis == "Log10"){
    plot <- plot + scale_x_log10(breaks = c(xElements), labels = c(xElements))
  }
  if (settings@showValues == TRUE){
    plot <- plot + geom_text(aes(label=round(MetricValue, 0)))
  }
  minValue <- min(tempResults$MetricValue)
  maxValue <- max(tempResults$MetricValue)
  if (settings@yAxis == "Continuous"){
    plot <- plot + scale_y_continuous(breaks = seq(minValue, maxValue, by=(maxValue-minValue)/7),
                                      labels = round(seq(minValue, maxValue, by=(maxValue-minValue)/7),2))
  }
  else if (settings@yAxis == "Log10"){
    plot <- plot + scale_y_log10(breaks = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),7), 
                                labels = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),2))
  }
  
  return (plot)
}

getChoices <- function(selections, uniqueValues){
  
}

