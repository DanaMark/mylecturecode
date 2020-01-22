
public class IfElseAndTernaryOperator {

		public static void main(String[] args) {
		// Ternary operator ?? 
		
		boolean test = true;
		
		if(test){
			System.out.println("test pass true");
		}else{
			System.out.println("test pass false");
		}
		String stringExp = "te ir stringa v'ert'iba";
		String res = (test) ? "test pass true" : "test pass false";
		
		System.out.println(res);
		System.out.println(stringExp);
		
		int num1 = 5;
		int num2 = 10;
		int result;
		
		result = (num1 < num2) ? (num1 + num2) : (num1 - num2);
		//ja true kreis'a puse, ja 
		// Ternary variable = (condition) ? return true : return false;
		System.out.println(result);
		
		
		
	}

}
