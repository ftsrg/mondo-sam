source("themes.R")

load <- function(path){
  results <- read.csv(path, head=TRUE, sep=",")
  return(results)
}


preprocess <- function(results){
  
  unique_scenarios <- unique(subset(results, CaseName == "ProtoCase")$Scenario)
  
  subtables <- vector(mode="list", length=length(unique_scenarios))
  names(subtables) <- (unique_scenarios)
  
  # insert iteration column
  first <- TRUE
  for(scen in unique_scenarios){
    tools <- unique(subset(results, Scenario==scen)$Tool)
    for(tool in tools){
      sizes <- unique(subset(results,Scenario==scen & Tool==tool)$Size)
      for(size in sizes){
        phases <- unique(subset(results,Scenario==scen & Tool==tool & Size==size)$PhaseName)
        for(phase in phases){
          metrics <- unique(subset(results, Scenario== scen & Tool==tool & 
                                     Size==size & PhaseName==phase)$MetricName)
          for(metric in metrics){
            sub <- subset(results, Scenario==scen & Tool==tool & Size==size &
                            PhaseName==phase & MetricName==metric)
            sub$Iteration <-seq_len(nrow(sub))
            if(first == TRUE){
              merged <- sub
              first <- FALSE
            }
            else
              merged <- rbind(merged, sub)
          }
        }
      }
    }
  }
  
  for(scen in unique_scenarios){
    unique_phases <- unique(subset(merged, CaseName == "ProtoCase" & Scenario == scen)$PhaseName)
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

createPlot <- function(results, settings){
  
  if (settings@theme == "Default")
    plot <- ggplot(results, aes(x=Size, y=MetricValue)) + 
            scale_shape_manual(values=1:nlevels(results$Tool)) +
            theme_grey() + geom_line(aes(group=Tool, colour=Tool)) + 
            geom_point(aes(shape=Tool, colour=Tool)) +
            xlab(settings@xLabel) +
            ylab(settings@yLabel) +
            ggtitle(label = settings@title)
  else if (settings@theme == "Black and White")
    plot <- ggplot(results, aes(x=Size, y=MetricValue)) +
            scale_shape_manual(values=1:nlevels(results$Tool)) +
            bwTheme + geom_line(aes(group=Tool)) + geom_point(aes(shape=Tool), size=3) + 
            xlab(settings@xLabel) +
            ylab(settings@yLabel) +
            ggtitle(label = settings@title)
  
  minSize <- min(results$Size)
  maxSize <- max(results$Size)
  sizes <- unique(results$Size)
  sizeCount <- length(sizes)
  if (settings@xAxis == "Continuous")
    plot <- plot + scale_x_continuous(breaks = c(sizes), labels = c(sizes))
  else if (settings@xAxis == "Log10")
    plot <- plot + scale_x_log10(breaks = c(sizes), labels = c(sizes))
  minValue <- min(results$MetricValue)
  maxValue <- max(results$MetricValue)
  if (settings@yAxis == "Continuous")
    plot <- plot + scale_y_continuous(breaks = seq(minValue, maxValue, by=(maxValue-minValue)/7),
                                      labels = round(seq(minValue, maxValue, by=(maxValue-minValue)/7),2))
  else if (settings@yAxis == "Log10")
    plot <- plot + scale_y_log10(breaks = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),7), 
                                labels = round(10^seq(log10(minValue), log10(maxValue), by=((log10(maxValue)-log10(minValue))/7)),2))
  
  return (plot)
}
