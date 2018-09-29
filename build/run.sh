#!/bin/bash
antlr4 drew.g4
javac *.java
grun drew compilationUnit -gui
