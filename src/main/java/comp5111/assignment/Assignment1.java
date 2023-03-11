package comp5111.assignment;

import java.io.File;
import java.io.FileWriter;
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
        //String[] classNames = Arrays.copyOfRange(args, 1, args.length);
        String[] classNames = {"comp5111.assignment.cut.Subject",
        		"comp5111.assignment.cut.Subject$ArrayTasks",
        		"comp5111.assignment.cut.Subject$BooleanTasks",
        		"comp5111.assignment.cut.Subject$CharTasks",
        		"comp5111.assignment.cut.Subject$FilenameTasks",
        		"comp5111.assignment.cut.Subject$GregorianTasks",
        		"comp5111.assignment.cut.Subject$NumberTasks",
        		"comp5111.assignment.cut.Subject$StringTasks"
        };
        		
        // we set up path directions and options such as keeping the line numbers and which packmanager to use
        // this is taken over from the soot-example project
        String targetPath = "./target/classes";
        String classUnderTestPath = "./target/raw-classes";
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + ":" + targetPath + ":" + classUnderTestPath);
        Options.v().set_output_dir(targetPath); 
        Options.v().set_keep_line_number(true);
        Options.v().setPhaseOption("jb", "use-original-names:true");
        Pack jtp = PackManager.v().getPack("jtp");
        System.out.println("Current statement counts: " + StatementCounter.getStatementInvocations());
        
        
        
        if (args[0].compareTo("0") == 0) {
        	
        	File newfile = new File("statement_coverage.txt");
        	FileWriter file = new FileWriter(newfile);
        	
        	 
            // TODO invoke your statement coverage instrument function
        	StatementInstrumenter statementinst = new StatementInstrumenter();
        	jtp.add(new Transform("jtp.instrumenter", statementinst));
        	
        	//write the cut and insert into soot
        	String classUnderTest = "comp5111.assignment.cut.Subject";
        	//soot.Main.main(new String[]{classUnderTest});  // added phases will be executed in this method
            soot.Main.main(classNames);
            // TODO run tests on instrumented classes to generate coverage report
            String[] tests = {"comp5111.assignment.cut.Regression__Test", "comp5111.assignment.cut.Regression__Test0"};
            for (int i = 0; i < tests.length; i++) {
            	runJunitTests(tests[i]);
            }
            
            System.out.println("Statements covered: " + StatementCounter.getStatementInvocations());
            StatementCounter.reset();
            System.out.println("Counter has been reset, counter value: " + StatementCounter.getStatementInvocations());
            file.close();
        } else if (args[0].compareTo("1") == 0) {
            // TODO invoke your branch coverage instrument function
        	
            // TODO run tests on instrumented classes to generate coverage report

        } else if (args[0].compareTo("2") == 0) {
            // TODO invoke your line coverage instrument function

            // TODO run tests on instrumented classes to generate coverage report

        }
    }
    
    private static void runJunitTests(String testname) {
    	//taken over from soot-example project
        Class<?> testClass = null;
        try {
            // here we programmitically run junit tests
            testClass = Class.forName(testname);
            JUnitCore junit = new JUnitCore();
            System.out.println("Running junit test: " + testClass.getName());
            junit.run(testClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}