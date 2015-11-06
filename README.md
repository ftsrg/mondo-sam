# MONDO-SAM
MONDO-SAM: A Framework to Systematically Assess MDE Scalability  

[![Build Status](https://travis-ci.org/FTSRG/mondo-sam.svg)](https://travis-ci.org/FTSRG/mondo-sam)

MONDO-SAM provides a common framework for benchmark developers written in Java, Python and R.

## Prerequisites

 * **Java SE 1.6**
 * **Python 3** (tested with 3.4)
 * **R** (3.2+)
 
Optionally:
 * **Maven 3**

Basically, the framework works as an Eclipse plugin project, but it supports Maven nature as well.

In order to resolve the Plugin-dependencies, install the following plugins from the [Orbit update site](http://download.eclipse.org/tools/orbit/downloads/):
 * **Data mapper for Jackson JSON processor**
 * **Jackson JSON processor**
 * **Guava: Google Core Libraries for Java Source**

## Usage

The first step is to define the own scenario and phase implementations. For further information, read the [wiki](https://github.com/FTSRG/mondo-sam/wiki).

### Results

Every benchmark result is saved to a JSON file. In order to convert the results to a CSV file, run the following:

```bash
./reporting/convert_results.py
```

To add specific paths, use the optional arguments. For more information, see `convert_results.py -h`

The operation above is also necessary for the reporting mechanism.

### Reporting in R

There is a chance to visualise the measurement results on diagrams. At first, install R and the required packages:

1. **Ubuntu**  
   
   ```bash
   sudo apt-get install -y r-base r-base-dev  
   cd reporting  
   sudo R -f install.R  
   ```
   
2. **Windows**
 * Download and install [R](http://cran.r-project.org/bin/windows/base/)
 * Adjust the system environment variables
 * In a command prompt with administrator rights, run:
   ```
   R -f install.R
   ```

After converting the results to the right CSV format (see above), it becomes feasible to start the reporting. The first option is that to use the interactive application.

#### Interactive Reporting

Besides the primary dependencies, it is necessary to install additional R packages:

```bash
cd reporting/shiny
sudo R -f install.R  
```

In order to launch the application, run the following script from the `reporting` directory:
```bash
./interactive.sh
```

It is possible to run the application in terminal (from the `reporting` directory again): 

```bash
R -e "shiny::runApp('./shiny/', launch.browser=TRUE)"
```

To run the application from a different source, just change the path parameter (`./shiny/`).


Or, import the `reporting/shiny/server.R` file into [RStudio](http://www.rstudio.com/) and click on the `Run App` button. However, note that some features are not available in RStudio, for example, it is not feasible to export the configurations.

#### Reporting 2

The second option is that to run the plot generation scripts directly without interactivity. In this case, it is necessary to use an external configuration file (`reporting/config.json`). 

At first, adjust the reporting configuration settings in the `reporting/config.json` file. These parameters determine exactly what kind of plots will be generated. For further information, read the reporting [section](https://github.com/FTSRG/mondo-sam/wiki/Reporting) on wiki.

Finally, it is already possible to generate the diagrams. The easiest way for this to use the Python wrapper module:

```bash
./reporting/report.py --source source_csv_path -- output output_folder_path --config config_json_path`
```

Insert valid parameters instead the paths. The wrapper module actually invokes the `reporting/generate_diagrams.R` script, however it is still recommended to use it for two reasons. The Python script:
 1. solves the working directory problem and
 2. provides a more useable argument parser than R.

#### Use both

It is possible as well to export the configurations that are adjusted in the interactive interface, and reuse it as an external configuration for the `generate_diagrams.R` (or `report.py`) script.
