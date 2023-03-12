package comp5111.assignment;

import java.util.HashMap;
import java.util.Map;

import soot.*;

public class StatementCounter {
	public Map<PositionClass, AttributeClass> stmtmap = new HashMap<PositionClass, AttributeClass>();
	public String classname = null;
	public int statements = 0;
	public int visited = 0;
	
	public void addStatement(int linenr, int columnnr, String instrname) {
		statements++;
		PositionClass pos = new PositionClass(linenr, columnnr);
		AttributeClass temp = new AttributeClass(instrname);
		temp.classname = classname;
		
		if (stmtmap.containsKey(pos)) { 
			System.out.println("Map already contains this key");
			System.exit(0);
			return;
		}
		//System.out.println("about to add statement to statement counter");
		stmtmap.put(pos, temp);
		return;
	} 
	
	public void visitStatement(int linenr, int columnnr) {
		visited++; 
		PositionClass pos = new PositionClass(linenr, columnnr);
		AttributeClass temp = stmtmap.get(pos);
		//System.out.println("executing visit statement method of: " + temp.className());
		//System.out.println("classname in attributeclass" + temp.classname);
		//temp.visited();
		//stmtmap.put(pos, temp);
		//System.out.println("current visited count: " + visited);
		return;
	}
}
 