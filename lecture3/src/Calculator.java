public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char omath = '+';

		double num1 = 100;
		double num2 = 23.2;
		double result;

		if (omath == '+') {
			result = num1 + num2;
			System.out.println(result);
		} else if (omath == '-') {
			result = num1 - num2;
			System.out.println(result);
		} else if (omath == '*') {
			result = num1 * num2;
			System.out.println(result);
		} else if (omath == '/') {
			result = num1 / num2;
			System.out.println(result);
		} else if (omath == '%') {
			if (num1 > num2) {
				result = num1 % num2;
				System.out.println(result);
			} else {
				System.out
						.println("If num1 less than num2, then result is num1");
			}
		}

		System.out.println("+++++++++++++++++++");
		System.out.println("____________________________________________");

		switch (omath) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
					System.out.println(result);
			break;
		case '%':
			if (num1 > num2) {
				result = num1 % num2;
				System.out.println(result);
			} else {
				System.out.println("If num1 less than num2, then result is num1: " + num1);}
			break;
			default: 
				System.out.println("nav operators");
		}
	}
	}
	

