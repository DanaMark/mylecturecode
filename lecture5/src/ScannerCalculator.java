import java.util.Scanner;


public class ScannerCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ievadi 1. skaitli : ");
		int num1 = input.nextInt();
		System.out.println("Ievadi operatoru : + - * / %");
		input.nextLine();
		String oper = input.next();
		System.out.println("Ievadi 2. skaitli : ");
		input.nextLine();
		int num2 = input.nextInt();
		int result = 0;
		
		if(oper.equals("+")){
			result = num1 + num2;
		}else if(oper.equals("-")){
			result = num1-num2;
		}else if(oper.equals("*")){
				result = num1 * num2;
		}else if(oper.equals("/")){
			result = num1 / num2;
		}else if(oper.equals("%")){
			result = num1 % num2;
		}else if(oper.equals("$")){
				System.out.println("Wrong operator");
				
		}
		System.out.println("rezultats ir "+result);
		
	}

}
