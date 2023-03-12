package comp5111.assignment;

import java.util.HashMap;
import java.util.Map;

import soot.*;

public class StatementCounter {
	public Map<PositionClass, AttributeClass> stmtmap = new HashMap<PositionClass, AttributeClass>();
	public int statements = 0;
	public int visited = 0;
	
	public void addStatement(int linenr, int columnnr, String instrname) {
		PositionClass pos = new PositionClass(linenr, columnnr);
		AttributeClass temp = new AttributeClass(instrname);
		
		if (stmtmap.containsKey(pos)) {
			System.out.println("Map already contains this key");
			//System.exit(0);
			return;
		}
		stmtmap.put(pos, temp);
		statements++;
		return;
	} 
	
	public void visitStatement(int linenr, int columnnr) {
		PositionClass pos = new PositionClass(linenr, columnnr);
		AttributeClass temp = stmtmap.get(pos);
		temp.visited = true;
		stmtmap.put(pos, temp);
		visited++;
		return;
	}
}
 