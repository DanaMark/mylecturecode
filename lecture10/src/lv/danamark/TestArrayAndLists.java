package lv.danamark;

public class TestArrayAndLists {

	public static void main(String[] args) {
		String[] arr = new String [10];
		String[] arrWith = { "go", "no", "he", "mo", "go", "no", "he", "mo", "da", "1" };
		arrToString(arr);
		System.out.println();
		arrToString(arrWith);
		addElementToArr(arr);
//		for(int i = 0; i < arr.length; i++){
//			System.out.println("index numbers are "+i+arrWith[i]);
//		}

	}
	public static void arrToString(String[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println("index numbers are "+i+" "+arr[i]);
		}
	}
	public static void addElementToArr(String[] arr){
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = arr[i] + i;
			}
		
		 arrToString(arr);
	}
	
}
