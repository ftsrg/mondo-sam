source("themes.R")

preprocess <- function(results, case){
  
  results <- subset(results, CaseName == case)
  unique_scenarios <- unique(results$Scenario)
  
  subtables <- vector(mode="list", length=length(unique_scenarios))
  names(subtables) <- (unique_scenarios)
  
  # insert iteration column
#   first <- TRUE
#   for(scen in unique_scenarios){
#     subFrameScenario <-subset(results, Scenario==scen)
#     tools <- unique(subFrameScenario$Tool)
#     for(tool in tools){
#       subFrameTool <- subset(subFrameScenario, Tool == tool)
#       sizes <- unique(subFrameTool$Size)
#       for(size in sizes){
#         subFrameSize <- subset(subFrameTool, Size == size)
#         phases <- unique(subFrameSize$PhaseName)
#         for(phase in phases){
#           subFramePhase <- subset(subFrameSize, PhaseName == phase)
#           metrics <- unique(subFramePhase$MetricName)
#           for(metric in metrics){
#             subFrameMetric <- subset(subFramePhase, MetricName == metric)
#             subFrameMetric$Iteration <-seq_len(nrow(subFrameMetric))
#             if(first == TRUE){
#               merged <- subFrameMetric
#               first <- FALSE
#             }
#             else
#               merged <- rbind(merged, subFrameMetric)
#           }
#         }
#       }
#     }
#   }
  
  for(scen in unique_scenarios){
#     unique_phases <- unique(subset(merged, CaseName == case & Scenario == scen)$PhaseName)
    unique_phases <- unique(subset(results, CaseName == case & Scenario == scen)$PhaseName)
    subtables[[scen]] <- vector(mode="list", length=length(unique_phases))
    names(subtables[[scen]]) <- unique_phases
    for(phase in unique_phases){
      subtables[[scen]][[phase]] <- subset(merged, Scenario==scen & PhaseName==phase)
      tools <- unique(subtables[[scen]][[phase]]$Tool)
      for(t in tools){
        for(s in unique(subset(subtables[[scen]][[phase]], Tool==t)$Size)){
          unique_metrics <- unique(subset(subtables[[scen]][[phase]], Tool==t && Size==s)$MetricName)
          for(m in unique_metrics){
            subtables[[scen]][[phase]]$Iteration <- seq_len(nrow(subset(subtables[[scen]][[phase]], 
                                                                        Tool==t & Size==s & MetricName==m)))
          }
        }
      }
    }
  }
  
  return(subtables)
}

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
