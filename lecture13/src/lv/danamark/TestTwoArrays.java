package lv.danamark;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTwoArrays {

	
	public static void main(String[] args) {
		int[] arr1 = {27, 7, 3, 4, 6, 2, 9, 3, 65, 3};
		int[] arr2 = {43, 1, 3, 5, 65, 32, 3, 4};
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for(int i : arr1){
			for(int j : arr2){
				if(i ==j){
					arrList.add(i);
					break;
					
				}
			}
		}
		
		System.out.println(Arrays.asList(arrList));
		
		System.out.println("test");
	}

}
