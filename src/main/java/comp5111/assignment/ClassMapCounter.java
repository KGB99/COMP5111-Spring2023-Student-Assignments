package comp5111.assignment;

import java.util.HashMap;
import java.util.Map;

public class ClassMapCounter {
	public static Map<String, StatementCounter> map = new HashMap<String, StatementCounter>();
	
	public static void addClass(String name) {
		StatementCounter temp = new StatementCounter();
		temp.classname = name; 
		map.put(name, temp);
	}
	
	public static StatementCounter returnCounter(String name) {
		return map.get(name);
	}
	
	public static void addStmt(String classname, String instrname, int linenr, int columnnr) {
		StatementCounter temp = map.get(classname);
		
		
		//try {
			temp.addStatement(linenr, columnnr, instrname);
		//} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		return;
	}
	
	public static void visitStmt(String classname, int linenr, int columnnr) {
		StatementCounter temp = map.get(classname);
		//System.out.println("using " + temp.classname + " statementcounter");
		temp.visitStatement(linenr, columnnr);
	}
}
