package J20190122;

import java.util.Arrays;

public class ArrayStudy {
	public static void main(String args[]) {
	int[] arr1 = {10, 20, 30, 40, 50};
	int[] arr2 = null;
	int[] arr3 = null;
	
	System.out.println("arr1.length = " + arr1.length);
	System.out.println("arr1 = " +Arrays.toString(arr1));
	
	arr3 = Arrays.copyOf(arr1, arr1.length);
	System.out.println("arr3.length = " + arr3.length);
	System.out.println("arr3 = " +Arrays.toString(arr3));
	
	arr2 = arr1;
	System.out.println("arr1 = " +arr1);
	System.out.println("arr2 = " +arr2);
	System.out.println("arr3 = " +arr3);
	}
}
