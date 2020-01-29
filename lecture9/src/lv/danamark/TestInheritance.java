package lv.danamark;

import lv.danamark.graph.Point2D;
import lv.danamark.graph.Point3D;
import lv.danamark.graph.Point4D;

public class TestInheritance {

	public static void main(String[] args) {
		Point2D point = new Point2D(11,-5);
		System.out.println(point.toString());
		Point2D pointXY = new Point2D(10,-2);
		System.out.println(pointXY.toString());
		
		pointXY.setX(8);
		pointXY.setY(-5);
		System.out.println(pointXY);
		
		System.out.println("X is: "+pointXY.getX());
		
		Point3D pointXYZ = new Point3D(3,2,11);
		System.out.println(pointXYZ);
		
		Point4D pointXYZT = new Point4D(3,5,7,9);
		System.out.println(pointXYZT);
		
		System.out.println(pointXYZT.getY());
		
		
		
	}

}
