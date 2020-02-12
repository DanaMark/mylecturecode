package lv.danamark.inputoutput;

import java.io.FileReader;

public class TestFileReader {

	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("Datatest.txt");
		int i;
		char test = 100;
		System.out.println(test);
		while((i=fr.read())!= -1){
			System.out.print((char)i);
		}
	}

}
