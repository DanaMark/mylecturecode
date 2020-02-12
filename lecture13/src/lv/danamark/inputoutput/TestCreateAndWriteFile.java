package lv.danamark.inputoutput;

import java.io.File;
import java.io.FileWriter;

public class TestCreateAndWriteFile {

	
	public static void main(String[] args) throws Exception {
		File file = new File("data1.txt");
		FileWriter fw = new FileWriter(file, true);
		//fw.write("Check does this work? test");
		//fw.close();
		
			//System.out.println("File exists. ");
			fw.write("Check does this work? test");
			fw.append("\n String next line tiesam?");
			fw.close();
		}
	}


