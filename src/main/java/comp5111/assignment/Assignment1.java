package comp5111.assignment;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import soot.*;
import soot.options.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.runner.JUnitCore;

public class Assignment1 {
	static String[] subjectClasses;

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		/* check the arguments */
		if (args.length <= 1 
				|| (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
			System.err.println("Usage: java comp5111.assignment.Assignment1 [coverage level] test-suite [soot options] "
					+ "classname");
			System.err.println("Usage: [coverage level] = 0 for statement coverage");
			System.err.println("Usage: [coverage level] = 1 for branch coverage");
			System.err.println("Usage: [coverage level] = 2 for line coverage");
			System.exit(0); 
		}

		// these args will be passed into soot.
		// String[] classNames = Arrays.copyOfRange(args, 1, args.length);
		String[] classNames = { "comp5111.assignment.cut.Subject", "comp5111.assignment.cut.Subject$NumberTasks",
				"comp5111.assignment.cut.Subject$CharTasks", "comp5111.assignment.cut.Subject$GregorianTasks",
				"comp5111.assignment.cut.Subject$FilenameTasks", "comp5111.assignment.cut.Subject$ArrayTasks",
				"comp5111.assignment.cut.Subject$StringTasks", "comp5111.assignment.cut.Subject$BooleanTasks" };
		subjectClasses = classNames;

		// we set up path directions and options such as keeping the line numbers and
		// which packmanager to use
		// this is taken over from the soot-example project
		String targetPath = "./target/classes";
		String classUnderTestPath = "./target/raw-classes";
		String ClassPathSeparator = ":";
		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			ClassPathSeparator = ";";
		}
		Options.v().set_soot_classpath(Scene.v().defaultClassPath() + ClassPathSeparator + targetPath
				+ ClassPathSeparator + classUnderTestPath);
		Options.v().set_output_dir(targetPath);
		Options.v().set_keep_line_number(true);
		Options.v().setPhaseOption("jb", "use-original-names:true");
		Pack jtp = PackManager.v().getPack("jtp");
		
		/*
		String[] tests = { "comp5111.assignment.cut.RegressionTest",
				"comp5111.assignment.cut.RegressionTest0",
				"comp5111.assignment.cut.RegressionTest1",
				"comp5111.assignment.cut.RegressionTest2",
				"comp5111.assignment.cut.RegressionTest3",
				"comp5111.assignment.cut.RegressionTest4",
				"comp5111.assignment.cut.RegressionTest5",
				"comp5111.assignment.cut.RegressionTest6",
				"comp5111.assignment.cut.RegressionTest7",
				"comp5111.assignment.cut.RegressionTest8"
		};
		*/
		String[] tests = {"comp5111.assignment.cut.Regression__Test", "comp5111.assignment.cut.Regression__Test0"};
		
		

		
		if (args[0].compareTo("0") == 0) {
			// Task 2:
			//initialize ClassMapStatement
			for (int i = 0; i < subjectClasses.length; i++) {
				ClassMapStatement.addClass(subjectClasses[i]);
			}
			
			File newfile = new File("statement_coverage.txt");
			FileWriter file = new FileWriter(newfile);
			file.write("STATEMENT COVERAGE REPORT\n\n");

			// TODO invoke your statement coverage instrument function
			StatementInstrumenter statementinst = new StatementInstrumenter();
			jtp.add(new Transform("jtp.instrumenter", statementinst));

			// write the cut and insert into soot
			String classUnderTest = "comp5111.assignment.cut.Subject";
			// this only covers subject but we need all classes 
			// soot.Main.main(new String[]{classUnderTest});
			// TODO run tests on instrumented classes to generate coverage report
			//String[] tests = { "comp5111.assignment.cut.Regression__Test",
			//		"comp5111.assignment.cut.Regression__Test0" };
			soot.Main.main(classNames);

			
			double overalltotal = 0.0;
			double overallcovered = 0.0;
			double total = 0.0;
			double covered = 0.0;
			for (int i = 0; i < tests.length; i++) {
				runJunitTests(tests[i]);

				// we need to write coverage of each JUNIT test seperately
				file.write("==========================================================================\n");
				file.write("Coverage of JUNIT test " + tests[i] + "\n\n");
				file.write("==========================================================================\n");

				for (int j = 0; j < subjectClasses.length; j++) {
					//StatementCounter current = ClassMapStatement.map.get(subjectClasses[i]);
					file.write(subjectClasses[j] + "\n");
					total = (double) ClassMapStatement.getStatements(subjectClasses[j]);
					overalltotal += total;
					covered = (double) ClassMapStatement.getVisited(subjectClasses[j]);
					overallcovered += covered;
					double coverage = covered / total * 100.0;
					file.write("Percentage: " + coverage + "%\n\n");
				}
				file.write("----------------------------------------------------\n");
				double overallcoverage = overallcovered / overalltotal * 100.0;
				file.write("Overall Coverage percentage: " + overallcoverage + "%\n");
				file.write("----------------------------------------------------\n\n");

				file.write("==========================================================================\n\n");
				file.write("The following shows the instructions along with a YES or NO after each statement which"
						+ " indicates wether it has been covered or not\n");
				file.write("----------------------------------------------------\n\n");
				for (int j = 0; j < subjectClasses.length; j++) {
					file.write(subjectClasses[j] + "\n");
					StatementCounter current = ClassMapStatement.map.get(subjectClasses[j]);
					Map<PositionClass, AttributeClass> map = current.stmtmap;
					Set<PositionClass> sortedInstructions = map.keySet();
					Iterator<PositionClass> iterator = sortedInstructions.iterator();
					while (iterator.hasNext()) {
						PositionClass pos = iterator.next();
						AttributeClass instr = map.get(pos);
						file.write("line " + instr.linenr + "," + pos.columnnr +  ", instr: " + instr.instrname);
						if (instr.visited) {
							file.write(", YES\n");
						} else {
							file.write(", NO\n");
						}
					}
					file.write("\n\n\n");
				}

			}
			// reset ClassMapCounter
			ClassMapStatement.reset();
			file.close();
		} else if (args[0].compareTo("1") == 0) {
			// Task 3:
			// intialize ClassMapLineBranch
			for (int i = 0; i < subjectClasses.length; i++) {
				ClassMapLineBranch.addClass(subjectClasses[i]);
			}
			
			File newfile = new File("branch_coverage.txt");
			FileWriter file = new FileWriter(newfile);
			file.write("BRANCH COVERAGE REPORT\n\n");

			// TODO invoke your statement coverage instrument function
			BranchInstrumenter branchinst = new BranchInstrumenter();
			jtp.add(new Transform("jtp.instrumenter", branchinst));

			// write the cut and insert into soot
			String classUnderTest = "comp5111.assignment.cut.Subject";
			// this only covers subject but we need all classes
			soot.Main.main(classNames);

			double overalltotal = 0.0;
			double overallcovered = 0.0;
			double total = 0.0;
			double covered = 0.0;
			for (int i = 0; i < tests.length; i++) {
				runJunitTests(tests[i]);

				// we need to write coverage of each JUNIT test seperately
				file.write("==========================================================================\n");
				file.write("Coverage of JUNIT test " + tests[i] + "\n\n");
				file.write("==========================================================================\n");

				for (int j = 1; j < subjectClasses.length; j++) {
					// StatementCounter current = ClassMapCounter.map.get(subjectClasses[i]);
					file.write(subjectClasses[j] + "\n");
					total = (double) ClassMapLineBranch.getStatements(subjectClasses[j]);
					overalltotal += total;
					//file.write("total branches: " + total + "\n");
					covered = (double) ClassMapLineBranch.getVisited(subjectClasses[j]);
					overallcovered += covered;
					//file.write("covered branches: " + covered + "\n");
					double coverage = covered / total * 100.0;
					file.write("Percentage: " + coverage + "%\n\n");
				}
				file.write("----------------------------------------------------\n");
				double overallcoverage = overallcovered / overalltotal * 100.0;
				file.write("Overall Coverage percentage: " + overallcoverage + "%\n");
				file.write("----------------------------------------------------\n\n");

				file.write("==========================================================================\n\n");
				file.write("The following shows the instructions along with a YES or NO after each branch which"
						+ " indicates wether it has been covered or not\n");
				file.write("----------------------------------------------------\n\n");
				for (int j = 0; j < subjectClasses.length; j++) {
					file.write(subjectClasses[j] + "\n");
					BranchLineCounter current = ClassMapLineBranch.map.get(subjectClasses[j]);
					Map<PositionClass, AttributeClass> map = current.stmtmap;
					Set<PositionClass> sortedInstructions = map.keySet();
					Iterator<PositionClass> iterator = sortedInstructions.iterator();
					while (iterator.hasNext()) {
						PositionClass pos = iterator.next();
						AttributeClass instr = map.get(pos);
						file.write("Branch on line: " + instr.linenr);
						if (instr.visited) {
							file.write(", YES\n");
						} else {
							file.write(", NO\n");
						}
					}
					file.write("\n\n\n");
				}
			}
			//reset class
			ClassMapLineBranch.reset();
			file.close();
		} else if (args[0].compareTo("2") == 0) {
			// bonus task
			// intialize ClassMapLineBranch
			for (int i = 0; i < subjectClasses.length; i++) {
				ClassMapLineBranch.addClass(subjectClasses[i]);
			}
			
			File newfile = new File("line_coverage.txt");
			FileWriter file = new FileWriter(newfile);
			file.write("LINE COVERAGE REPORT\n\n");

			// TODO invoke your statement coverage instrument function
			LineInstrumenter statementinst = new LineInstrumenter();
			jtp.add(new Transform("jtp.instrumenter", statementinst));
			
			// write the cut and insert into soot
			String classUnderTest = "comp5111.assignment.cut.Subject";
			// this only covers subject but we need all classes 
			// soot.Main.main(new String[]{classUnderTest});
			soot.Main.main(classNames);

			double overalltotal = 0.0;
			double overallcovered = 0.0;
			double total = 0.0;
			double covered = 0.0;
			for (int i = 0; i < tests.length; i++) {
				runJunitTests(tests[i]);

				// we need to write coverage of each JUNIT test seperately
				file.write("==========================================================================\n");
				file.write("Coverage of JUNIT test " + tests[i] + "\n\n");
				file.write("==========================================================================\n");

				for (int j = 0; j < subjectClasses.length; j++) {
					// StatementCounter current = ClassMapCounter.map.get(subjectClasses[i]);
					file.write(subjectClasses[j] + "\n");
					total = (double) ClassMapLineBranch.getStatements(subjectClasses[j]);
					overalltotal += total;
					//file.write("total statements: " + total + "\n");
					covered = (double) ClassMapLineBranch.getVisited(subjectClasses[j]);
					overallcovered += covered;
					//file.write("covered statements: " + covered + "\n");
					double coverage = (covered / total * 100.0);
					file.write("Percentage: " + coverage + "%\n\n");
				}
				file.write("----------------------------------------------------\n");
				double overallcoverage = overallcovered / overalltotal * 100.0;
				file.write("Overall Coverage percentage: " + overallcoverage + "%\n");
				file.write("----------------------------------------------------\n\n");

				file.write("==========================================================================\n\n");
				file.write("The following shows the lines along with a YES or NO after each line which"
						+ " indicates wether it has been covered or not\n");
				file.write("----------------------------------------------------\n\n");
				for (int j = 0; j < subjectClasses.length; j++) {
					file.write(subjectClasses[j] + "\n");
					BranchLineCounter current = ClassMapLineBranch.map.get(subjectClasses[j]);
					Map<PositionClass, AttributeClass> map = current.stmtmap;
					Set<PositionClass> sortedInstructions = map.keySet();
					Iterator<PositionClass> iterator = sortedInstructions.iterator();
					while (iterator.hasNext()) {
						PositionClass pos = iterator.next();
						AttributeClass instr = map.get(pos);
						file.write("line " + instr.linenr);
						if (instr.visited) {
							file.write(", YES\n");
						} else {
							file.write(", NO\n");
						}
					}
					file.write("\n\n\n");
				}

			}

			//reset class
			ClassMapLineBranch.reset();
			file.close();
		}
	}

	private static void runJunitTests(String testname) {
		// taken over from soot-example project
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