package lv.danamark.repeatJavaClassOOP;

public class ImplementInterface implements InterFaceClass{

	@Override
	public void sendEmail() {
		System.out.println("email");
		
	}

	@Override
	public int sentEmailCount() {
		int i = 0;
		int sentEmailCount = 0;
		sentEmailCount ++;
		
		return ++i;
	}
	
	

}
