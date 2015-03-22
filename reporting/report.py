"""

@author Zsolt Kovari

Represent a wrapper module for R reporting scripts in order to prevent
working directory problems.
"""
import os
import logging
import subprocess
import argparse


def set_working_directory(path=None):
    """
    Sets the working directory to this script's folder or to the path
    optional parameter, if that is given.

    Parameters:
    @param path: optional parameter, a directory
    """
    if path is None:
        full_path = os.path.realpath(__file__)
        path = os.path.split(full_path)
        os.chdir(path[0])
    else:
        if os.path.exists(path):
            os.chdir(path)
        else:
            logging.error("The given parameter is not a valid directory:" +
                          path)


if __name__ == "__main__":
    set_working_directory()
    parser = argparse.ArgumentParser(
        formatter_class=argparse.ArgumentDefaultsHelpFormatter)
    parser.add_argument("-s", "--source",
                        default="../results/results.csv",
                        help="Path of the CSV file.")
    parser.add_argument("-o", "--output",
                        default="../../diagrams/",
                        help="Location of the folder where the plots will be "
                             "generated.")
    args = parser.parse_args()
    subprocess.call(["Rscript", "generate_diagrams.R", args.source,
                    args.output])
