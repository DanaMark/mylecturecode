
public class ArraysAndLoop {

	//Declare variable
	public static void main(String[] args) {
	
		int[] marks = {76, 23, 54, 43, 98, 65, 34};
		
		//make toString all elements of array and print out
		
		System.out.println(marks[0]);
		System.out.println("[" +marks[0]+ " " +marks[1]+"]");
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		for(int i = 0; i < marks.length; i++){
			System.out.println(marks[i]);
			//println = drukaa liiniju
		}
		for(int i = 0; i < marks.length; i++){
			System.out.print(marks[i]);
			//print = print in one line
		}
		
		System.out.println("\n"+"+++++++++");
		
		
		System.out.print("[ ");
		for(int i = 0; i < marks.length-1; i++){
			System.out.print(marks[i]+" , ");
		}
			System.out.print(marks[6]+" ] ");
			
			System.out.println("\n" +marks.length);
			System.out.println(marks.length-1);
			
		}		
	}



