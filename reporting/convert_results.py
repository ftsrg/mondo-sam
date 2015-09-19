#!/usr/bin/env python3
"""
Created on Jan 27, 2015

@author: Zsolt Kovari

Process the results json files and merge them to another new JSON and CSV file.
"""

import json
import os
import glob
import argparse
import csv
import re

def natural_key(string_):
    """See http://www.codinghorror.com/blog/archives/001018.html"""
    return [int(s) if s.isdigit() else s for s in re.split(r'(\d+)', string_)]


def set_working_directory(path=None):
    """
    Set the working directory to this script's folder or to the path
    optional parameter, if that is given.
    
    Parameters:
    @param path: optional parameter, a directory, default value is None
    """
    if path is None:
        full_path = os.path.realpath(__file__)
        path = os.path.split(full_path)
        os.chdir(path[0])
    else:
        if os.path.exists(path):
            os.chdir(path)
        else:
            print("The given parameter is not a valid directory:" + path)


def load_results(path):
    """
    Load json files under the given path parameter and store them in a list as 
    json objects.
    
    Parameters:
    @param path: the locations of json files
    """
    file_paths = sorted(glob.glob(path + "/*.json"), key=natural_key)
    json_objects = list()
    for file_path in file_paths:
        with open(file_path) as file:
            json_objects.append(json.load(file))
    return json_objects
    

def convert_results_to_csv(json_objects, csvpath):
    """Convert json objects into csv.
    
    Parameters:
    @param json_objects: a list of json objects 
    @param csvpath: location of the CSV file
    """
    with open(csvpath, mode='w') as csvfile:
        headers = set()
        for result in json_objects:
            keys = set(result["Case"].keys())
            if "PhaseResults" in keys:
                keys.remove("PhaseResults")
            for phase in result["PhaseResults"]:
                keys.update(set(phase.keys()))
                for metric in phase["Metrics"]:
                    keys.update(set(metric.keys()))
            if "Metrics" in keys:
                keys.remove("Metrics")
            headers.update(keys)
            headers.add("Iteration")
        
        writer = csv.DictWriter(csvfile, headers)
        writer.writeheader()

        for result in json_objects:
            phases_dict = dict()
            row = dict()
            for h in headers:
                row.update({h: "NaN"})
            for k in result["Case"].keys():
                if k in headers:
                    row.update({k: result["Case"][k]})
            for phase in result["PhaseResults"]:
                for k in phase.keys():
                    if k in headers:
                        row.update({k: phase[k]})
                if phase["PhaseName"] in phases_dict.keys():
                    phases_dict[phase["PhaseName"]] += 1
                    row.update({"Iteration": phases_dict[phase["PhaseName"]]})
                else:
                    phases_dict.update({phase["PhaseName"]: 1})
                    row.update({"Iteration": 0})

                for metric in phase["Metrics"]:
                    for k in metric.keys():
                        if k in headers:
                            row.update({k: metric[k]})
                    writer.writerow(row)
            

def write_json_objects(json_objects, filename):
    """Write the json objects contained list to a file.
    
    Parameters:
    @param json_objects: a list of json objects
    @param filename: the location and name of the written file 
    """
    with open(filename, mode="w", encoding="utf-8") as file:
        json.dump(json_objects, file, sort_keys=True, indent=2)

    
if __name__ == "__main__":
    parser = argparse.ArgumentParser(
        formatter_class=argparse.ArgumentDefaultsHelpFormatter)
    parser.add_argument("-j", "--jsonfile",
                        default="../../results/results.json",
                        help="Path of the JSON file where " +
                             "results will be merged.")
    parser.add_argument("-c", "--csvfile",
                        default="../../results/results.csv",
                        help="Path of the CSV file where the " +
                             "results will be merged"
                        )
    parser.add_argument("-s", "--source",
                        default="../../results/json",
                        help="Path of the results json files location."
                        )
    args = parser.parse_args()
    
    set_working_directory()
    json_objects = load_results(args.source)
    write_json_objects(json_objects, args.jsonfile)
    convert_results_to_csv(json_objects, args.csvfile)
    print("The results have been written successfully.")
