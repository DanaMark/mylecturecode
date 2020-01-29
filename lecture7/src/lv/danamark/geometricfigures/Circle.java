package lv.danamark.geometricfigures;

public class Circle {
	
	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOR = "red";
	public static final char[] getArea = null;
	
	private double radius;
	private String color;
	private Object figure1;
	
	public Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;	
		
	}
	
	public Circle(double rad){
		this.radius = rad;
		this.color = DEFAULT_COLOR;
	}
	public Circle(double rad, String c){
		this.radius = rad;
		this.color = c;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		//double rad = DEFAULT_RADIUS;
		//double Area = rad * rad * Math.PI; 
		return this.radius * this.radius * Math.PI;
						
	}
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
}
