package lv.danamark.inputoutput;

import java.io.*;
import java.util.Scanner;

	public class HelloUser {
		
		public static void main(String[] args) throws Exception{
			
		//public static <FileToString> void main(String[] args) {
		
//		FileToString 
//		String userName = new userName;
//		
//		String defStr = "Hello user "+userName;
//		System.out.println(defStr+" Raimonds");
		

//	public static void main(String[] args){
		String defStr = "Hello user userName";
//		
//		String lastString = defStr.replace("userName", "");
//		
//		System.out.println(lastString+ "Raimonds");
//		
//	
//	}
	File file = new File("Datatest.txt");
	
	Scanner sc = new Scanner(file);
	String stringFromTextFile = "";
	while(sc.hasNextLine()){
		stringFromTextFile = sc.nextLine();
	}
		//System.out.println("Check: "+stringFromTextFile);
		String lastString = defStr.replace("userName", "");
		String userName = "Raimonds bort";
		File fileForUser = new File(userName+".txt");
		FileWriter fw = new FileWriter(fileForUser, true);
		fw.write(lastString+userName);
		fw.append("\n String next line tiesam?");
		fw.close();
	}

		private static void String(String string) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

