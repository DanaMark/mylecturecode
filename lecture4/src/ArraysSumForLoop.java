
public class ArraysSumForLoop {

	
	public static void main(String[] args) {
		int[] marks = {76, 23, 54, 43, 98, 65, 34};
		//summ all values in arrays
		int result = 0;
		int testInt = 90;
		result = testInt;
		
		System.out.println("result value: "+result);
		
		System.out.println(marks[0]+marks[1]);
		
		int sum = 0;
		
		for(int i = 0; i < marks.length; i++){
			sum += marks[i];
		}	
			System.out.println("sum of marks: "+sum);
	
	
			int subOperator = 1000;
			
			subOperator = subOperator -= 100;
			subOperator = subOperator -= 150;
			subOperator = subOperator -= 170;
		
			System.out.println("test substraction operator:  " +subOperator);
			
		
	}

}

