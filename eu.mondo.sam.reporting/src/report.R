library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)


results <- read.csv("./results/results.csv", head=TRUE, sep=",")
print(results)


generate_plot <- function(){
  
  
  
}


unique_cases <- unique(results$CaseName)
unique_phases <- unique(results$PhaseName)
for(case in unique_cases){
  for(phase in unique_phases){
    
  }
}
