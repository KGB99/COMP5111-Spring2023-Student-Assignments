package comp5111.assignment;

import java.util.Map;

import java.util.TreeMap;

// I had intended on only using this for statements but it translates well to all other coverages too, so its used in branch and line coverage too
public class BranchLineCounter {
	public Map<PositionClass, AttributeClass> stmtmap = new TreeMap<PositionClass, AttributeClass>();
	public String classname = null;
	public int statements = 0;
	public int visited = 0;

	public void addStatement(int linenr, int columnnr, String instrname) {
		
		//do i need this?
		PositionClass pos = new PositionClass(linenr, columnnr);
		if (stmtmap.containsKey(pos)) {
			//System.out.println("Map already contains this key");
			return;
		} 
		 
		
		statements++;
		
		//System.out.println("Have added : " + statements + " so far");
		AttributeClass temp = new AttributeClass(instrname);
		temp.linenr = linenr;
		temp.classname = classname;
		stmtmap.put(pos, temp);
		return;
	}

	public void visitStatement(int linenr, int columnnr) {
		PositionClass pos = new PositionClass(linenr, columnnr);
		AttributeClass temp = stmtmap.get(pos);

		if (temp.visited) {
			return;
		}
		visited++;
		temp.visited();
		stmtmap.put(pos, temp);
		return;
	}
}
