library("shiny")

results <- read.csv("../../results/results.csv", head=TRUE, sep=",")

unique_cases <- unique(results$CaseName)
case_list <- list()
for(case in unique_cases){
  case_list <- c(case, case, case_list)
}

unique_scenarios <- unique(results$Scenario)
scenarios_list <- list()
for(s in unique_scenarios){
  scenarios_list <- c(s, s, scenarios_list)
}

shinyUI(fluidPage(
  titlePanel("Reporting"),
    
  sidebarLayout(
    sidebarPanel(
      selectInput("case", label="Select Case",
                  #choices = list("Time" = "Time", "Steps" = "Steps"),
                  #selected = "time"
                  choices = case_list,
                  selected=case_list[0]
                  ),
      uiOutput("scenario"),
      uiOutput("phase"),
      uiOutput("metric"),
      uiOutput("iteration")
    ),
   mainPanel(
     plotOutput("plot")
     )
  )
))