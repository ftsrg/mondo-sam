# createFolders <- function(rootPath, subFolders){
#   if (file.exists(rootPath) == FALSE){
#     dir.create(rootPath)
#   }
#   for (folder in subFolders){
#     path <- paste(rootPath, folder, sep='')
#     if (file.exists(path) == FALSE){
#       dir.create(path)
#     }
#   }
# }

# concatPhases <- function(phases){
#   phases <- unlist(phases)
#   first <- TRUE
#   for(p in phases){
#     if(first){
#       merged <- p
#       first <- FALSE
#     }
#     else{
#       merged <- paste(merged, p, sep='+')
#     }
#   }
#   return(merged)
# }

# getXLabels <- function(dimension, artifacts){
#   ticks <- c()
#   mapping <- fromJSON(mappingPath)
#   for(item in artifacts){
#     if (as.character(item) %in% names(mapping[[dimension]])){
#       ticks <- c(ticks, mapping[[dimension]][[as.character(item)]])
#     }
#     else{
#       ticks <- c(ticks, item)
#     }
#   }
#   return(ticks)
# }

# injectValues <- function(results, text){
#   scenario <- unique(results$Scenario)
#   tool <- unique(results$Tool)
#   caseName <- unique(results$CaseName)
#   phase <- unique(results$PhaseName)
#   size <- unique(results$Size)
#   text <- inject(text, "SCENARIO", scenario)
#   text <- inject(text, "TOOL", tool)
#   text <- inject(text, "CASENAME", caseName)
#   text <- inject(text, "PHASENAME", phase)
#   text <- inject(text, "SIZE", size)
#   return(text)
# }

#' Replace the sample in text with the value parameter.
# inject <- function(text, sample, value){
#   if (length(value) > 1){
#     text <- gsub(sample, value[1], text)
#   }
#   else{
#     text <- gsub(sample, value, text)
#   }
#   return(text)
# }


updateConfigData <- function(oldData, configuration, key){
  if (key %in% names(configuration)){
    value <- configuration[[key]]
    if (!is.na(value)){
      return(value)
    }
  }
  return(oldData)
}