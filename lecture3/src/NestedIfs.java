
public class NestedIfs {

	public static void main(String[] args) {
		
		int time = 5;
		if (time < 10){
			if(time < 6 && time < 10)
			System.out.println("Morning!");
		}else{
			System.out.println("go sleep!");
			
			if (time > 10)
			System.out.println("Good day");
			
		}
	}

}
