package lv.danamark;

import lv.danamark.users.Teacher;

public class TestPerson {

	
	public static void main(String[] args) {
		
		String[] strArr = new String[12];
		strArr[0] = "Sport";
		strArr[1] = "Math";
		
		System.out.println(strArr[0]+", "+strArr[1]);
		
		Teacher teacher1 = new Teacher("Toms", "Riga");
		System.out.println(teacher1.toString());
		//teacher1.addCourse("Sport");
		
		
		String[] courses = {"Sport", "Math", "biology", "History"};
		
		
		
		
	}
	

}
