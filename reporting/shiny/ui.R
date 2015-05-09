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
                   tabPanel(
                     "Dimensions",
                     selectInput("xdimension", label="X Dimension",
                                 choices = c("Scenario", "CaseName", "Tool", "Size", "Iteration"), 
                                 selected = "Size"),
                     # change selections list too if the selected element is modified
                     uiOutput("legend"),
                     uiOutput("legendFilters")
                     ),
                   # Plot settings panel
                   tabPanel(
                     "Plot settings",
                     selectInput("xaxis", label="X-axis",
                                 c("Continuous" = "con", "Log2" = "log2", "Factor" = "factor"),
                                 selected="log2"),
                     selectInput("yaxis", label="Y-axis",
                                 c("Continuous" = "con", "Log2" = "log2", "Factor" = "factor"),
                                 selected="log2"),
                     sliderInput("yscale", "Y-Axis Scale", min = -9, max = 9, value = 0, step = 1),
                     selectInput("theme", label="Themes",
                                 choices=c("Default", "Black and White")),
                     textInput("title", "Title", value="SCENARIO CASENAME PHASENAME"),
                     uiOutput("titleTemplate"),
                     actionButton("titleInsert", "Insert Title"),
                     textInput("xlabel", label="X-axis label"),
                     textInput("ylabel", label="Y-axis label"),
                     checkboxInput("showValues", label="Show Values", value=FALSE),
                     checkboxInput("drawLines", label="Draw Lines", value=TRUE)
                   ),
                   # Publish panel
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