package comp5111.assignment;

import java.util.HashMap;
import java.util.Map;

public class ClassMapLineBranch {
	public static HashMap<String, BranchLineCounter> map = new HashMap<String, BranchLineCounter>(); 
	
	public static void addClass(String name) {
		BranchLineCounter temp = new BranchLineCounter();
		temp.classname = name; 
		map.put(name, temp); 
	}
	
	public static BranchLineCounter returnCounter(String name) {
		return map.get(name);
	}
	
	public static int getVisited(String name) {
		return map.get(name).visited;
	}
	
	public static int getStatements(String name) { 
		return map.get(name).statements;
	}
	
	public static void addStmt(String classname, String instrname, int linenr, int columnnr) {
		BranchLineCounter temp = map.get(classname);
		temp.addStatement(linenr, columnnr, instrname);
		
		return;
	}
	
	public static void visitStmt(String classname, int linenr, int columnnr) {
		BranchLineCounter temp = map.get(classname);
		temp.visitStatement(linenr, columnnr);
		return;
	}
	
	public static void reset() {
		map = null;
		return;
	}
}
