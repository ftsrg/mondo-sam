library("shiny")

shinyUI(navbarPage("Reporting",
                   tabPanel("Source",
                            fileInput('file', 'Choose CSV File',
                                      accept=c('text/csv', 
                                               'text/comma-separated-values,text/plain', 
                                               '.csv')),
                            uiOutput("load"),
                            tags$hr(),
                            radioButtons('sep', 'Separator',
                                         c(Comma=',',
                                           Semicolon=';',
                                           Tab='\t'),
                                         ','),
                            radioButtons('quote', 'Quote',
                                         c(None='',
                                           'Double Quote'='"',
                                           'Single Quote'="'"),
                                         '')
                            ),
                   tabPanel("Results",
                            sidebarLayout(
                              sidebarPanel(
                                uiOutput("scenario"),
                                uiOutput("tool"),
                                uiOutput("case"),
                                uiOutput("size"),
                                uiOutput("phase"),
                                uiOutput("metric"),
                                uiOutput("iteration"),
                                actionButton("visualize", "Draw plot")
                              ),
                              mainPanel(
                                plotOutput("plot")
                              ),
                            )
                   ),
                   tabPanel(
                     "Dimensions",
                     selectInput("xdimension", label="X Dimension",
                                 choices = c("Scenario", "CaseName", "Tool", "Size", "Iteration"), selected = "Size"),
                     uiOutput("mix"),
                     selectInput("legend", label="Legend",
                                 choices = c("Scenario", "CaseName", "Tool", "Size", "MetricName"), selected = "MetricName")
#                      uiOutput("xdimension"),
#                      uiOutput("mix"),
#                      uiOutput("legend")
                     ),
                   tabPanel(
                     "Plot settings",
                     selectInput("xaxis", label="X-axis",
                                 choices = c("Continuous", "Log10"),
                                 selected="Log10"),
                     selectInput("yaxis", label="Y-axis",
                                 choices = c("Continuous", "Log10"),
                                 selected="Log10"),
                     sliderInput("yscale", "Y-Axis Scale", min = -9, max = 9, value = 0, step = 1),
                     selectInput("theme", label="Themes",
                                 choices=c("Default", "Black and White")),
                     textInput("title", "Title", value="SCENARIO CASENAME PHASENAME"),
                     uiOutput("titleTemplate"),
                     actionButton("titleInsert", "Insert Title"),
                     textInput("xlabel", label="X-axis label"),
                     textInput("ylabel", label="Y-axis label"),
                     checkboxInput("showValues", label="Show values", value=FALSE)
                   ),
                   tabPanel(
                     "Publish",
                     textInput("filename", label="Filename", value="CASENAME-SCENARIO"),
                     uiOutput("publishTemplate"),
                     actionButton("publishInsert", label="Insert Filename"),
                     selectInput("format","File Format",
                                 choices=c("PDF", "PNG")),
                     checkboxGroupInput("publishGroup",label="Publish Settings",
                                        choices=list("All Scenarios"="scenarios", "All Cases"="cases")),
                     actionButton("publish",label="Save Diagrams")
                     )
)
)