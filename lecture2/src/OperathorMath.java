
public class OperathorMath {

	public static void main(String[] args) {
		double num1 = 0.5d;
		double num2 = 0.80d;
		double result1;
		double result2;
		double result3;
		double result4;
		
		char add = '+';
		char sub = '-';
		char mul = '*';
		char div = '/';
		
		result1 = num1 + num2;
		result2 = num1 - num2;
		result3 = num1 * num2;
		result4 = num1 / num2;
		
		System.out.println(num1 + " " + add + " " + num2 + " = " + result1);
		System.out.println();
		System.out.println(num1 + " " + sub + " " + num2 + " = " + result2);
		System.out.println();
		System.out.println(num1 + " " + mul + " " + num2 + " = " + result3);
		System.out.println();
		System.out.println(num1 + " " + div + " " + num2 + " = " + result4);
		
		int a = 11;
		int b = 3;
		int x = a % b;
		
		System.out.println("x = " + x);
		
		int i = 1;
		i++;
		
		System.out.println(i);
		i++;
		System.out.println(i);
		
		int k = 2;
		//return incement result
		int p = ++k;
		
		System.out.println("p = " + p);
		p++;
		System.out.println(p);
		
		int o = 2;
		int f = o++;
		
		System.out.println(f);
		
		
		
		
		
		
		
		
		

	}

}
