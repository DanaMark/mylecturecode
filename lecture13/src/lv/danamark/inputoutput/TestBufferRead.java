package lv.danamark.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestBufferRead {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("Datatest.txt");
		
		//BufferedReader buffReader = new BufferedReader(new FileReader(file)); šis, vai divi zemāk esošie
		FileReader filReader = new FileReader(file);
		
		BufferedReader buffReader = new BufferedReader(filReader);
		String stringFileData;
			
		while((stringFileData = buffReader.readLine())!= null){
			System.out.println(stringFileData);
		}
		
		
	}

}
