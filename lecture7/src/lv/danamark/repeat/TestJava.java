package lv.danamark.repeat;

import java.util.Scanner;
//import java.util.InvalidPropertiesFormatException;;


public class TestJava {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//InvalidPropertiesFormatException input1 = new Scanner(System.in)
		
		System.out.println("Input Value ");
		
		int inputValue;
		
		
		while(!(input.hasNextInt())){
			inputValue = input.nextInt();
			System.out.println("Wrong data, try again"+inputValue);
			break;	
		}if(input.hasNextInt()){
			System.out.println("Your INT is : "+input.nextInt());
			}
			
	}
		

}
