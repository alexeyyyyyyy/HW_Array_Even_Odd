package evenodd.utils;

import java.util.Arrays;
import java.util.Comparator;


public class OddEvenComparator implements Comparator<Integer> {
	public static void printArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	@Override
	public int compare(Integer num1, Integer num2) {
		if(num1 % 2 == 0 && num2 % 2 !=0) {
			return -1;
		}
		if(num1 % 2 != 0 && num2 % 2 == 0) {
			return 1;
		}
		
		if(num1 % 2 == 0 && num2 % 2 ==0) {
			return Integer.compare(num1, num2);
		}
		if(num1 % 2 != 0 && num2 % 2 !=0) {
			return Integer.compare(num2, num1);
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		Integer[] arrNum = {1,2,3,4,5,6,7,8,9,3};
		Arrays.sort(arrNum,new OddEvenComparator());
		printArray(arrNum);
	}
}
