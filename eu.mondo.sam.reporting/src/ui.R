library("shiny")

shinyUI(navbarPage("Reporting",
                   tabPanel("Results",
                            sidebarLayout(
                              sidebarPanel(
                                selectInput("case", label="Select Case",
                                            #choices = list("Time" = "Time", "Steps" = "Steps"),
                                            #selected = "time"
                                            choices = c("ProtoCase"),
                                            selected="ProtoCase"
                                ),
                                uiOutput("scenario"),
                                uiOutput("phase"),
                                uiOutput("mix"),
                                uiOutput("metric"),
                                uiOutput("iteration"),
                                uiOutput("axis")
                              ),
                              mainPanel(
                                plotOutput("plot")
                              ),
                            )
                   ),
                   tabPanel(
                     "Plot settings",
                     selectInput("xaxis", label="X-axis",
                                 choices = c("Continuous", "Log10")),
                     selectInput("yaxis", label="Y-axis",
                                 choices = c("Continuous", "Log10")),
                     textInput("title", label="Title"),
                     textInput("xlabel", label="X-axis label"),
                     textInput("ylabel", label="Y-axis label")
                   )
)
)