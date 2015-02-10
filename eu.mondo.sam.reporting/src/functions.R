load <- function(path){
  results <- read.csv(path, head=TRUE, sep=",")
  return(results)
}


preprocess <- function(results){
  
  unique_scenarios <- unique(subset(results, CaseName == "ProtoCase")$Scenario)
  
  subtables <- vector(mode="list", length=length(unique_scenarios))
  names(subtables) <- (unique_scenarios)
  
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
  
  plot <- ggplot(results, aes(x=Size, y=MetricValue)) +
    geom_line(aes(group=Tool, colour=Tool)) +
    geom_point(aes(shape=Tool, colour=Tool)) +
    xlab(settings@xLabel) +
    ylab(settings@yLabel) +
    ggtitle(label = settings@title)

  
  return (plot)
}
