package lv.danamark.interfaces;

public class Rectangle implements Shape{
	
	private int lenght;
	private int width;
	
	public Rectangle(int len, int wid){
		this.lenght = len;
		this.width = wid;
	}

	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
	}

	@Override
	public double getArea() {
		return lenght * width;
	}
	
		
		
		
		
	

}
