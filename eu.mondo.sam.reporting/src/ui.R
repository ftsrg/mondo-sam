library("shiny")

shinyUI(navbarPage("Reporting",
                   tabPanel("Results",
                            sidebarLayout(
                              sidebarPanel(
                                selectInput("case", label="Case",
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
                     selectInput("theme", label="Themes",
                                 choices=c("Default", "Black and White")),
                     uiOutput("title"),
                     uiOutput("titleTemplate"),
                     actionButton("titleInsert", "Insert"),
                     textInput("xlabel", label="X-axis label"),
                     textInput("ylabel", label="Y-axis label")
                   ),
                   tabPanel(
                     "Publish",
                     textInput("filename", label="Filename", value="CASENAME-SCENARIO"),
                     uiOutput("publishTemplate"),
                     actionButton("publishInsert", label="Insert"),
                     selectInput("format","File format",
                                 choices=c("PDF", "PNG")),
                     checkboxGroupInput("publishGroup",label="Publish Settings",
                                        choices=list("All Scenarios"="scenarios", "All Phases"="phases")),
                     actionButton("publish",label="Save Diagrams")
                     )
)
)