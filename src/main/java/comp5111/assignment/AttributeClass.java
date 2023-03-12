package comp5111.assignment;

public class AttributeClass {
	public String instrname = null;
	public String classname = null;
	public Boolean visited = false;
	
	public AttributeClass(String instrname) {
		this.instrname = instrname;
	}
	
	public void visited() {
		visited = true;
	}
	
	public String className() {
		return classname;
	}
}
