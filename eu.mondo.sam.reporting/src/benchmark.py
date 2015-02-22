#!/usr/bin/env python3
"""
Created on Feb 2, 2015

@author: Zsolt Kovari

Run benchmark measurements.
"""

import subprocess
import glob
import os


def set_working_directory(path = None):
    """
    Set the working directory to this script's folder or to the path
    optional parameter, if that is given.
    
    Parameters:
    @param path: optional parameter, a directory, default value is None
    """
    if (path == None):
        full_path = os.path.realpath(__file__)
        path = os.path.split(full_path)
        os.chdir(path[0])
    else:
        if (os.path.exists(path) == True):
            os.chdir(path)
        else:
            print("The given parameter is not a valid directory:"+ path)


set_working_directory()
scenarios = ["scenario1", "scenario2", "scenario3"]
tools = ["Allegro", "Virtuoso", "Sesame", "Neo4j", "MySQL", \
         "Java", "BigData", "Drools5"]
sizes = [1,2,4,5,6,8]
cases = ["case1", "case2", "case3"]
resultPath = "../../results/json/"

folder = "../../eu.mondo.sam.proto/target/"
           
files = glob.glob(folder + "*.jar")
if (len(files) >0):
    target = files[0]

for t in tools:
    for sc in scenarios:
        for case in cases:
            for s in sizes:
                subprocess.call(["java", "-jar", target, "-size", str(s), \
                                 "-scenario", sc, "-tool", t, \
                                 "-resultPath", resultPath, "-case", case])
    
