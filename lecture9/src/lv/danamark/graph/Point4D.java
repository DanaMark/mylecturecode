package lv.danamark.graph;

public class Point4D extends Point2D {
	private int z;
	private int t;
	
	
	public Point4D(int x, int y, int z, int t){
		
		super (x, y);
		this.z = z;
		this.t = t; 
		
	}
	public String toString(){
		return "("+super.getX()+", "+super.getY()+", "+this.z+", "+this.t+ ")";
		
		
	//System.out.println(th);	
	}

}
