package lv.dana;

public class LearnMethodsWithParameter {

	//cast 
	public static void main(String[] args) {
		
		double radius = 1.2;
		
		String color = "red";
		int resultWithInt = getArea(radius);
		double result = getAreaCircle(radius);
		System.out.println("Area: "+resultWithInt);
		System.out.println("Area2 : "+result);
		System.out.println(getColorAndArea(color, result));
		
	}
	
	public static int getArea(double radius){
		double result = Math.PI * radius * radius;
		return (int) result; 
		
	}
	
	public static double getAreaCircle(double radius){
		double result = Math.PI * radius * radius;
		return result; 
		
	}
	public static String getColorAndArea(String color, double area){
		return "Color: "+ color + " and area:  " + area;
		
		
		
	}

}
