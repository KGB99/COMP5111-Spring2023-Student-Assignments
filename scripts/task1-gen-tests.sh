# This is a display of my terminal commands, however in practice i wrote these line by line into terminal
# For the sake of documentation I have rewritten them here and upon a test
# with a copy of the assignment this seemed to accurately reproduce tests using randoop
# i used arbitrary randomseed values so these tests will most likely be different to mine

CDIR="$(PWD)"
ROOT_DIR="$(dirname "$CDIR")"
RANDOOP_JAR=${ROOT_DIR}/lib/randoop-all-4.3.1.jar
TARGET=${ROOT_DIR}/target/classes

# compile class under test
echo "compiling comp5111.assignment.cut.Subject ..."
javac -d "$ROOT_DIR"/target/raw-classes "$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java

echo "generating tests..."
java -ea -classpath JAVA_HOME:"$ROOT_DIR"/target/raw-classes:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=0 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop0

java -ea -classpath JAVA_HOME:"$ROOT_DIR"/target/raw-classes:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=1 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop1

java -ea -classpath JAVA_HOME:"$ROOT_DIR"/target/raw-classes:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=5 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop2

java -ea -classpath JAVA_HOME:"$ROOT_DIR"/target/raw-classes:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=7 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop3

java -ea -classpath JAVA_HOME:"$ROOT_DIR"/target/raw-classes:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=10 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop4

