"""
    This script adds an // Alexandros Apostolidis in the beginning of every
    Aufgabe*.java file in the given folder.
"""
import sys, os

def main(path):
    files = os.listdir(path)
    for f in files:
        #if f.startswith("Aufgabe") and f.endswith(".java"):
        if f.endswith(".java"):
            with open(path+"/"+f, "r") as fp:
                content = fp.read()
            with open(path+"/"+f, "w") as fp:
                fp.write("// Alexandros Apostolidis\n"+content)

if __name__ == "__main__":
    args = sys.argv
    if len(args) == 1:
        path = input("Please enter the path: ")
    else: 
        path = args[1]  
    main(path)
