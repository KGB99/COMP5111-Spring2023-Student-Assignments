package comp5111.assignment;

import java.util.HashMap;
import java.util.Map;

public class ClassMapCounter {
	public static Map<String, StatementCounter> map = new HashMap<String, StatementCounter>();
	
	public static void addClass(String name) {
		StatementCounter temp = new StatementCounter();
		map.put(name, temp);
	}
	
	public static StatementCounter returnCounter(String name) {
		return map.get(name);
	}
	
	public static void addStmt(String classname, int linenr, int columnnr) {
		StatementCounter temp = map.get(classname);
		try {
			temp.addStatement(linenr, columnnr, classname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
	
	public static void visitStmt(String classname, int linenr, int columnnr) {
		StatementCounter temp = map.get(classname);
		temp.visitStatement(linenr, columnnr);
	}
}
