library("shiny")

shinyUI(navbarPage("Reporting",
                   tabPanel("Source",
                            fileInput('file', 'Choose CSV File',
                                      accept=c('text/csv', 
                                               'text/comma-separated-values,text/plain', 
                                               '.csv')),
                            uiOutput("dummy"),
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
                                uiOutput("case"),
                                uiOutput("scenario"),
                                uiOutput("phase"),
                                uiOutput("tool"),
                                uiOutput("mix"),
                                uiOutput("metric"),
                                checkboxInput("mix", label = "Mix", value = FALSE),
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
                                 choices = c("Size", "Iteration"), selected = "Size"),
                     selectInput("group", label="Group",
                                 choices = c("Tool", "Case"), selected = "Tool")
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
                     selectInput("titleTemplate", "Title Templates",
                                 choices=c("CaseName", "Scenario", "PhaseName", "MetricName")),
                     actionButton("titleInsert", "Insert Title"),
                     textInput("xlabel", label="X-axis label"),
                     textInput("ylabel", label="Y-axis label")
                   ),
                   tabPanel(
                     "Publish",
                     textInput("filename", label="Filename", value="CASENAME-SCENARIO"),
                     selectInput("publishTemplate", "Filename Templates",
                                 choices=c("CaseName", "Scenario", "PhaseName", "MetricName")),
                     actionButton("publishInsert", label="Insert Filename"),
                     selectInput("format","File Format",
                                 choices=c("PDF", "PNG")),
                     checkboxGroupInput("publishGroup",label="Publish Settings",
                                        choices=list("All Scenarios"="scenarios", "All Cases"="cases")),
                     actionButton("publish",label="Save Diagrams")
                     )
)
)