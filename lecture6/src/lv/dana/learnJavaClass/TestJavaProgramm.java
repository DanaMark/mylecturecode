package lv.dana.learnJavaClass;

public class TestJavaProgramm {

		public static void main(String[] args) {
			Box boxObject = new Box();//konstruktors
			
			
			double volume;
			
			
			double width = 20.05;
			
			boxObject.width = 20.05;
			boxObject.height = 3.5;
			boxObject.depth = 15.1;
			double result = boxObject.getVolume();
			
			System.out.println("Volume from method : " +result);
			
			//volume = boxObject.width * boxObject.height * boxObject.depth;
			
			//System.out.println("Volume is " +volume);
			
			
			//Box boxObject2 = new Box();
			//System.out.println(boxObject2.width);
			
			
	}

}
