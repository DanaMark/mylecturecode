
public class TestIfElseAndBlocks {

	
	public static void main(String[] args) {
		
		System.out.println("********");
		System.out.println("********");
		
		boolean test = true;
		int result;
		
		if(test){
			int number = 100;
			System.out.println("TRUE");
			System.out.println(number + number);
			result = number + number;
			System.out.println("result value is " + result);
		}else{
			System.out.println("FALSE");
		}
		
		System.out.println("After if else block");
		

		boolean test2 = true;
		
		if(test2){
			int number = 350;
			result = number + number;
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
		
		System.out.println("After");
	}

}
