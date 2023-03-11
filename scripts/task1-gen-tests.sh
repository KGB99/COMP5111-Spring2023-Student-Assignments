# This is a display of my terminal commands, however more accurately i used
# the $(pwd) command to get the path of the root directory and then put the 
# values of the rest of the paths related to that value, however upon a test
# of a copy of the assignment this seemed to accurately reproduce tests using randoop

ROOT_DIR=../
RANDOOP_JAR=${ROOT_DIR}/lib
TARGET=${ROOT_DIR}/target/classes
java -ea -classpath JAVA_HOME:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=0 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop0

java -ea -classpath JAVA_HOME:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=1 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop1

java -ea -classpath JAVA_HOME:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=2 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop2

java -ea -classpath JAVA_HOME:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=3 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop3

java -ea -classpath JAVA_HOME:${RANDOOP_JAR}:${TARGET}/ \
   randoop.main.Main gentests \
   --testclass=comp5111.assignment.cut.Subject \
   --time-limit=60 \
   --junit-package-name=comp5111.assignment.cut \
   --randomseed=4 \
   --junit-output-dir=${ROOT_DIR}/src/test/randoop4

