createFolders <- function(rootPath, subFolders){
  if (file.exists(rootPath) == FALSE){
    dir.create(rootPath)
  }
  for (folder in subFolders){
    path <- paste(rootPath, folder, sep='')
    if (file.exists(path) == FALSE){
      dir.create(path)
    }
  }
}

concatPhases <- function(phases){
  phases <- unlist(phases)
  first <- TRUE
  for(p in phases){
    if(first){
      merged <- p
      first <- FALSE
    }
    else{
      merged <- paste(merged, p, sep='+')
    }
  }
  return(merged)
}

getXLabels <- function(artifacts){
  ticks <- c()
  for(size in artifacts){
    value <- labels[[as.character(size)]]
    if(is.null(value)){
      value = size
    }
    ticks <- c(ticks, value)
  }
  return(ticks)
}

injectValues <- function(results, text){
  scenario <- unique(results$Scenario)
  tool <- unique(results$Tool)
  caseName <- unique(results$CaseName)
  phase <- unique(results$PhaseName)
  size <- unique(results$Size)
  text <- inject(results, text, "SCENARIO", scenario)
  text <- inject(results, text, "TOOL", tool)
  text <- inject(results, text, "CASENAME", caseName)
  text <- inject(results, text, "PHASENAME", phase)
  text <- inject(results, text, "SIZE", size)
  return(text)
}

inject <- function(results, text, sample, value){
  if (length(value) > 1){
    text <- gsub(sample, value[1], text)
  }
  else{
    text <- gsub(sample, value, text)
  }
  return(text)
}