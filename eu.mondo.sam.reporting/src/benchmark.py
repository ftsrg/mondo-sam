#!/usr/bin/env python3
"""
Created on Feb 2, 2015

@author: Zsolt Kovari

Run benchmark measurements.
"""

import subprocess
import glob

scenarios = ["scenario1", "scenario2", "scenario3"]
tools = ["Allegro", "Virtuoso"]
sizes = [1,2,4,8,16]
resultPath = "../../results/json/"

folder = "../../eu.mondo.sam.proto/target/"
           
files = glob.glob(folder + "*.jar")
if (len(files) >0):
    target = files[0]

for t in tools:
    for sc in scenarios:
        for s in sizes:
            subprocess.call(["java", "-jar", target, "-size", str(s), "-scenario", sc, \
                        "-tool", t, "-resultPath", resultPath])
    
