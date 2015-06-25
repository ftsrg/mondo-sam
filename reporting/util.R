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


updateConfigData <- function(oldData, configuration, key){
  if (key %in% names(configuration)){
    value <- configuration[[key]]
    if (!is.na(value)){
      if (is.list(value)){
        return(unlist(value))
      }
      return(value)
    }
  }
  return(oldData)
}