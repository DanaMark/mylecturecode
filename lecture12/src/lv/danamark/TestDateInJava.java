package lv.danamark;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateInJava {

	
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		
		System.out.println("Time when launched: "+myDateObj);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		System.out.println(myFormatObj);
		
		String formatedDate = myDateObj.format(myFormatObj);
		System.out.println("After formating time: "+formatedDate);
		
		
		
	}
	
	

}
