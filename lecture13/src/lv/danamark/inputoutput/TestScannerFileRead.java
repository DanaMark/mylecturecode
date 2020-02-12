package lv.danamark.inputoutput;

import java.io.File;
import java.util.Scanner;

public class TestScannerFileRead {

	
	public static void main(String[] args) throws Exception {
		File file = new File("Datatest.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		

	}

}
