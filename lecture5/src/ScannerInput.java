import java.util.Scanner;


public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int number = scan.nextInt();
		scan.next();
		System.out.println("Enter name: ");
		
		String name = scan.nextLine();
		
		System.out.println("Your number  is " +number/2);
		System.out.println("Your name is "+name);
	}
}
