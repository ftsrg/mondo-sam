library("shiny")

shinyUI(navbarPage("Reporting", id="reporting",
                   # Source panel
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
                   # Results panel
                   tabPanel("Results", id="results",
                            sidebarLayout(
                              sidebarPanel(
                                uiOutput("scenario"),
                                uiOutput("tool"),
                                uiOutput("case"),
                                uiOutput("size"),
                                uiOutput("phases"),
                                uiOutput("metrics"),
                                uiOutput("iteration"),
                                actionButton("visualize", "Draw plot")
                              ),
                              mainPanel(
                                plotOutput("plot")
                              ),
                            )
                   ),
                   # Dimensions panel
                   tabPanel("Dimensions", id="dimensions", 
                     uiOutput("xDimension"),
                     uiOutput("legend"),
                     uiOutput("legendFilters")
                     ),
                   # Plot settings panel
                   navbarMenu(
                     "Plot Settings",
                     tabPanel("Labels",
                              fluidRow(
                                column(4,
                                       textInput("title", "Title", value="SCENARIO CASENAME PHASENAME"),
                                       uiOutput("titleTemplate")
                                ),
                                column(4, offset = 2, 
                                       textInput("xLabel", label="X-Axis Label"),
                                       textInput("yLabel", label="Y-Axis Label")
                                )
                              ),
                              fluidRow(
                                column(2, offset = 1, 
                                       actionButton("titleInsert", "Insert Title"))
                              )
                     ),
                     tabPanel("Scales and Data",
                              selectInput("xAxis", label="X-axis",
                                          c("Continuous" = "con", "Log2" = "log2", "Factor" = "factor"),
                                          selected="log2"),
                              selectInput("yAxis", label="Y-axis",
                                          c("Continuous" = "con", "Log2" = "log2", "Factor" = "factor"),
                                          selected="log2"),
                              sliderInput("yScale", "Y-Axis Scale", min = -15, max = 15, value = 0, step = 1),
                              checkboxInput("showValues", label="Show Values", value=FALSE),
                              checkboxInput("drawLines", label="Draw Lines", value=TRUE)
                     ),
                     tabPanel("Theme",
                              uiOutput("theme"),
                              uiOutput("legendPosition"),
                              uiOutput("legendDirection"),
                              uiOutput("pointSize"),
                              uiOutput("lineSize"),
                              uiOutput("textSize"),
                              uiOutput("textFont"),
                              uiOutput("xTextSize"),
                              uiOutput("yTextSize"),
                              uiOutput("xHjust"),
                              uiOutput("yHjust"),
                              uiOutput("xVjust"),
                              uiOutput("yVjust")
                     )
                   ),
                   # Publish panel
                   tabPanel(
                     "Publishing",
                     sidebarLayout(
                       sidebarPanel(
                         selectInput("format", label = "File Format",
                                     choices = c("PDF", "PNG")),
                         checkboxGroupInput("publishGroup", label = "Publish Settings",
                                            choices = list("All Scenarios" = "scenarios", "All Cases" = "cases")),
                         actionButton("publish", label = "Save Diagrams"),
                         textOutput("response")
                       ),
                       mainPanel(
                         tabsetPanel(
                           tabPanel("Location",
                                    tags$p("Current directory:"),
                                    textOutput("cwd"),
                                    tags$p(),
                                    textInput("location", label = "Add Location", value = "../../diagrams")
                           ),
                           tabPanel("Filename",
                                    tags$p(),
                                    checkboxInput("automaticFilename", label = "Generate Automatically", value = TRUE),
                                    uiOutput("filename"),
                                    uiOutput("publishTemplate"),
                                    uiOutput("publishInsert")
                           )
                         )
                       )
                     )
                   )
)
)