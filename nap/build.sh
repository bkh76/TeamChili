#! /bin/bash

antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'
$antlr4 -o  parser -package parser -visitor nap.g4
javac parser/*.java
javac -Xlint napc/*.java

