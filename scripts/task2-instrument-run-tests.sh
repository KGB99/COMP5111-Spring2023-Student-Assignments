#!/bin/bash

DIR=$( cd "$(dirname "$0")" >/dev/null 2>&1 || exit ; pwd -P )
ROOT_DIR="$DIR"/..
cd "$ROOT_DIR" || exit

if [ ! -d "$ROOT_DIR"/target/raw-classes ]; then
    mkdir -p "$ROOT_DIR"/target/raw-classes
fi

# 1. we compile the class under test castle.comp5111.example.Subject
echo "compiling comp5111.assignment.cut.Subject ..."
javac -d "$ROOT_DIR"/target/raw-classes "$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java

# 2. we compile the classes to instrument Subject and count invocations using soot
echo "compiling instrumentation classes ..."
if [ ! -d "$ROOT_DIR"/target/classes ]; then
    mkdir -p "$ROOT_DIR"/target/classes
fi
find "$ROOT_DIR"/src -name "*.java" -print0 | xargs -0 \
  javac -classpath .:"$ROOT_DIR"/lib/* -d "$ROOT_DIR"/target/classes

# 3. we run the main method of castle.comp5111.example.EntryPoint
echo "coverage number 0..."
java -classpath .:"$ROOT_DIR"/lib/*:"$ROOT_DIR"/target/classes comp5111.assignment.Assignment1 0 Subject Subject$ArrayTasks Subject$BooleanTasks Subject$CharTasks Subject$FilenameTasks Subject$GregorianTasks Subject$NumberTasks Subject$StringTasks

