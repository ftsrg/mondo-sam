# MONDO-SAM
MONDO-SAM: A Framework to Systematically Assess MDE Scalability  

[![Build Status](https://travis-ci.org/FTSRG/mondo-sam.svg)](https://travis-ci.org/FTSRG/mondo-sam)

MONDO-SAM provides a common framework for benchmark developers.

## Prerequisites

 * **Java SE 1.6**
 * **Python 3** (tested with 3.4)
 * **R** (>3.02)
 
Optionally:
 * *Maven 3*

Basically, the framework is an Eclipse plugin project, but supports Maven nature as well.

To resolve the Plugin-dependencies, install the following plugins from the [Orbit update site](http://download.eclipse.org/tools/orbit/downloads/):
 * **Data mapper for Jackson JSON processor**
 * **Jackson JSON processor**
 * **Guava: Google Core Libraries for Java Source**

## Usage

The first step is to define the own scenario and phase implementations. For further information, read the [wiki](https://github.com/FTSRG/mondo-sam/wiki).

### Results

Every benchmark result is saved to a JSON file. In order to convert the results to a CSV file, run the following:
 * `./reporting/convert_results.py`

The operation above is also necessary for reporting.

### Reporting

Firstly, install R and the required packages:

1. **Ubuntu**  
   ```
   sudo apt-get install -y r-base r-base-dev  
   
   cd reporting  
   
   sudo R -f install.R  
   ```
2. **Windows**
 * Download and install [R](http://cran.r-project.org/bin/windows/base/)
 * Adjust the system environment variables
 * In an admin command prompt, run: `
   * `R -f install.R`

After converting the results to the right CSV format (see above), adjust the reporting configuration settings in the `reporting/config.json` file. These parameters will determine exactly what kind of plots will be generated.

Finally, it is already possible to generate the diagrams. The easiest way for this to use the Python wrapper module:
 * `./reporting/report.py --source source_csv_path -- output output_folder_path --config config_json_path`

Insert valid parameters instead the paths. The wrapper module actually just invokes the `generate_diagrams.R` script, but it is still recommended to use for two reasons. The Python script:
 1. can solve the working directory problem easily and
 2. provides a more useable argument parser.
