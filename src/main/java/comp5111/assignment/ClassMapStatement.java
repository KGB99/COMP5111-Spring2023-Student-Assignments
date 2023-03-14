package comp5111.assignment;

import java.util.HashMap;
import java.util.Map;

public class ClassMapStatement {
	public static HashMap<String, StatementCounter> map = new HashMap<String, StatementCounter>();
	
	public static void addClass(String name) {
		StatementCounter temp = new StatementCounter();
		temp.classname = name; 
		map.put(name, temp); 
	}
	
	public static StatementCounter returnCounter(String name) {
		return map.get(name);
	}
	
	public static int getVisited(String name) {
		return map.get(name).visited;
	}
	
	public static int getStatements(String name) { 
		return map.get(name).statements;
	}
	
	public static void addStmt(String classname, String instrname, int linenr, int columnnr) {
		StatementCounter temp = map.get(classname);
		//System.out.println("adding statement " + linenr + ", " + columnnr);
		temp.addStatement(linenr, columnnr, instrname);
		
		return;
	}
	
	public static void visitStmt(String classname, int linenr, int columnnr) {
		StatementCounter temp = map.get(classname);
		temp.visitStatement(linenr, columnnr);
		return;
	}
	
	public static void reset() {
		map = null;
		return;
	}
}
