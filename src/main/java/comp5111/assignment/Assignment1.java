package comp5111.assignment;

import java.io.IOException;

import soot.*;
import soot.options.*;
import java.util.Arrays;

import org.junit.runner.JUnitCore;

public class Assignment1 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        /* check the arguments */
        if (args.length <= 1 || (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 [coverage level] test-suite [soot options] " +
                "classname");
            System.err.println("Usage: [coverage level] = 0 for statement coverage");
            System.err.println("Usage: [coverage level] = 1 for branch coverage");
            System.err.println("Usage: [coverage level] = 2 for line coverage");
            System.exit(0);
        }
        

        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 1, args.length);
        
        // we set up path directions and options such as keeping the line numbers and which packmanager to use
        // this is taken over from the soot-example project
        String targetPath = "./target/classes";
        String classUnderTestPath = "./target/raw-classes";
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + ":" + targetPath + ":" + classUnderTestPath);
        Options.v().set_output_dir(targetPath);
        Options.v().set_keep_line_number(true);
        Options.v().setPhaseOption("jb", "use-original-names:true");
        Pack jtp = PackManager.v().getPack("jtp");
        
        
        
        
        if (args[0].compareTo("0") == 0) {
            // TODO invoke your statement coverage instrument function
        	StatementInstrumenter statementinst = new StatementInstrumenter();
        	jtp.add(new Transform("jtp.instrumenter", statementinst));
        	
        	//write the cut and insert into soot
        	String classUnderTest = "comp5111.assignment.cut.Subject";
            soot.Main.main(new String[]{classUnderTest});  // added phases will be executed in this method
            
            // TODO run tests on instrumented classes to generate coverage report
            runJunitTests();
            
            System.out.println("Statements covered: " + StatementCounter.getStatementInvocations());
        } else if (args[0].compareTo("1") == 0) {
            // TODO invoke your branch coverage instrument function
        	
            // TODO run tests on instrumented classes to generate coverage report

        } else if (args[0].compareTo("2") == 0) {
            // TODO invoke your line coverage instrument function

            // TODO run tests on instrumented classes to generate coverage report

        }
    }
    
    private static void runJunitTests() {
    	//taken over from soot-example project
        Class<?> testClass = null;
        try {
            // here we programmitically run junit tests
            testClass = Class.forName("comp5111.assignment.cut.Regression__Test");
            JUnitCore junit = new JUnitCore();
            System.out.println("Running junit test: " + testClass.getName());
            junit.run(testClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}