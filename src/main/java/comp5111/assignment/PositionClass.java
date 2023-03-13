package comp5111.assignment;

public class PositionClass implements Comparable<PositionClass>{
	int linenr;
	int columnnr;
	public PositionClass(int linenr, int columnnr) {
		this.linenr = linenr;
		this.columnnr = columnnr; 
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true; 
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		PositionClass other = (PositionClass) o;
		
		return (other.columnnr == this.columnnr && other.linenr == this.linenr);
	}

	@Override
	public int compareTo(PositionClass o) {
		if (this.linenr == o.linenr) {
			if (this.columnnr == o.columnnr) return 0;
			return (this.columnnr > o.columnnr) ? 1 : -1;
		} else {
			return (this.linenr > o.linenr) ? 1 : -1;
		}
	}
}
