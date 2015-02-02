library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)


results <- read.csv("../../results/results.csv", head=TRUE, sep=",")


generate_plot <- function(table, file_name){
  plot <- ggplot(table, aes(x=Size, y=MetricValue)) +
    geom_line(aes(group=Tool, colour=Tool)) +
    geom_point(aes(shape=Tool, colour=Tool))
  
  ggsave(plot,file = file_name, width=14, height=7, dpi=192)
  print(file_name)
  
}


unique_cases <- unique(results$CaseName)

path <- c("../../diagrams/")
if (file.exists(path) == FALSE){
  dir.create(path)
}

for(case in unique_cases){
  unique_scenarios <- unique(subset(results, CaseName==case)$Scenario)
  for(scenario in unique_scenarios){
    unique_phases <- unique(subset(results, CaseName==case & Scenario==scenario)$PhaseName)
    for(phase in unique_phases){
      unique_metrics <- unique(subset(results,CaseName==case & Scenario==scenario & PhaseName==phase)$MetricName)
      for(metric in unique_metrics){
        subtable <- subset(results, CaseName==case & Scenario==scenario & PhaseName==phase & MetricName==metric)
        subtable <- ddply(subtable, c("Tool", "Size"), summarise, MetricValue = sum(MetricValue))
        file_name <- paste(path,case,"-",scenario,"-",phase,"-",metric, ".png", sep = "")
        generate_plot(subtable, file_name)
      }
    }
  }
}

