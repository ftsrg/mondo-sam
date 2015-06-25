library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("shiny", quietly=T, verbose=F, warn.conflicts=FALSE)
library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("R.oo", quietly=T, verbose=F, warn.conflicts=FALSE)


options(warn = -1)
source("../results/Result.R", echo = FALSE)
source("BasicTester.R", echo = FALSE)
source("LoaderTester.R", echo = FALSE)
source("SubframeTester.R", echo = FALSE)
source("SerializerTester.R", echo = FALSE)
source("GenerationTester.R", echo = FALSE)
source("../serializers/ConfigurationSerializer.R", echo = FALSE)
source("../results/Publisher.R", echo = FALSE)
source("../filters/FilterContainer.R", echo = FALSE)
source("../plots/PlotContainer.R", echo = FALSE)
source("../filters/Selections.R", echo = FALSE)
source("../filters/DataFilter.R", echo = FALSE)
source("../filters/ScenarioFilter.R", echo = FALSE)
source("../filters/ToolFilter.R", echo = FALSE)
source("../filters/CaseFilter.R", echo = FALSE)
source("../filters/SizeFilter.R", echo = FALSE)
source("../filters/PhaseFilter.R", echo = FALSE)
source("../filters/MetricFilter.R", echo = FALSE)
source("../filters/IterationFilter.R", echo = FALSE)
source("../filters/XDimensionFilter.R", echo = FALSE)
source("../filters/LegendFilter.R", echo = FALSE)
source("../filters/SpecificLegendFilter.R", echo = FALSE)
source("../filters/PublishingFilter.R", echo = FALSE)
source("../plots/PlotContainer.R", echo = FALSE)
source("../plots/PlotSettings.R", echo = FALSE)
source("../plots/Theme.R", echo = FALSE)
source("../plots/Plot.R", echo = FALSE)
source("../../generator.R", echo = FALSE)
source("../../validation.R", echo = FALSE)
source("../../util.R", echo = FALSE)
options(warn = 1)


loader <- LoaderTester()
loader$runTests()

result <- Result()
result$setFrame(loader$.results)
subFrameTester <- SubframeTester()
subFrameTester$.result <- result
subFrameTester$runTests(result)

serializerTester <- SerializerTester()
serializerTester$init(result)
serializerTester$.serializer <- ConfigurationSerializer()
serializerTester$.serializer$.filterContainer <- serializerTester$.filterContainer
serializerTester$.serializer$.plotContainer <- serializerTester$.plotContainer
serializerTester$.serializer$.publisher <- serializerTester$.publisher
serializerTester$runTests()

generationTester <- GenerationTester()
generationTester$init(result)
generationTester$.serializer <- ConfigurationSerializer()
generationTester$.serializer$.filterContainer <- generationTester$.filterContainer
generationTester$.serializer$.plotContainer <- generationTester$.plotContainer
generationTester$.serializer$.publisher <- generationTester$.publisher
generationTester$runTests()
