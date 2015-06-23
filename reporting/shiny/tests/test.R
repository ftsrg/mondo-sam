library("ggplot2",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("plyr",  quietly=T, verbose=F, warn.conflicts=FALSE)
library("shiny", quietly=T, verbose=F, warn.conflicts=FALSE)
library("jsonlite", quietly=T, verbose=F, warn.conflicts=FALSE)
library("R.oo", quietly=T, verbose=F, warn.conflicts=FALSE)


options(warn = -1)
source("../Result.R", echo = FALSE)
source("BasicTester.R", echo = FALSE)
source("LoaderTester.R", echo = FALSE)
source("SubframeTester.R", echo = FALSE)
options(warn = 1)


loader <- LoaderTester()
loader$runTests()

result <- Result()
result$setFrame(loader$.results)
subFrameTester <- SubframeTester()
subFrameTester$.result <- result
subFrameTester$runTests(result)


