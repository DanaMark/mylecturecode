package lv.danamark.repeat;

import java.util.Scanner;

public class TestScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double TAX_RATE_20K = 0.1;
		final double TAX_RATE_30K = 0.2;
		final double TAX_RATE_40K = 0.3;
		final int SENTINEL = -1;
		
		
		int taxableIncome;
		double taxPayable;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter taxable income: $ ");
		taxableIncome = sc.nextInt();
		
		while(taxableIncome != SENTINEL){
			if(taxableIncome <= 20000){
				System.out.println("you pay taxes : "+taxableIncome * 0.1);
				break;
			}else if(taxableIncome <= 30000){
				System.out.println("you pay taxes : "+taxableIncome * 0.2);
				break;
			}else if(taxableIncome <= 40000){
				System.out.println("you pay taxes : "+taxableIncome * 0.3);
				break;
			}
			
			else if(taxableIncome > 40000){
				System.out.println("paldies, Tu pelni par daudz");
				break;
			}
		
		
			System.out.println("Enter taxable income: $ ");
			taxableIncome = sc.nextInt();
			
//			
//			while(taxableIncome != SENTINEL){
//				if(taxableIncome <= 20000){
//					taxPayable = taxableIncome * TAX_RATE_20K;
//					break;
//				}else if(taxableIncome <= 30000){
//					System.out.println("you pay taxes : "+taxableIncome * 0.2);
//					break;
//				}else if(taxableIncome <= 40000){
//					System.out.println("you pay taxes : "+taxableIncome * 0.3);
//					break;
//				}
//				
//				else if(taxableIncome > 40000){
//					System.out.println("paldies, Tu pelni par daudz");
//					break;
//				}
//			
//			
//				
//		}
		
		
		}
	}
	
}


		
	

