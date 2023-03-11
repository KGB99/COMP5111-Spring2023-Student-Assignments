# navigate to /.../COMP5111-Spring2023-Student-Assignments/target
ROOT_DIR="$PWD"
cd "$ROOT_DIR" || exit

# 1. we compile the class under test
echo "compiling Subject class... "
javac -d "$ROOT_DIR"/target/classes "$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java

# 2. We compile all the instrumentation classes and count instructions using soot
echo "compiling instrumentation classes... "
find "$ROOT_DIR"/src/main/java -name "*.java" -print0 | xargs -0 \
  javac -classpath .:"$ROOT_DIR"/lib/* -d "$ROOT_DIR"/target/classes

# 3. we run the main method of comp5111.assignment.Assignment1
echo "running Assignment 1 with coverage level 0"
java -classpath .:"$ROOT_DIR"/lib/*:"$ROOT_DIR"/target/classes comp5111.assignment.Assignment1 0