#! /bin/bash

PATH_TO_FX=/usr/local/lib/javafx-sdk-14/lib

if [[ -d $PATH_TO_FX ]]
then
    antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'
    $antlr4 -o parser -package parser -visitor nap.g4
    javac -Xlint parser/*.java
    javac --module-path $PATH_TO_FX --add-modules javafx.base -Xlint compiler/BuildAST.java
    javac --module-path $PATH_TO_FX --add-modules javafx.base -Xlint compiler/Main.java
else
    echo "Could not find directory with JavaFX."
    echo "Tried to look in: $PATH_TO_FX"
fi

