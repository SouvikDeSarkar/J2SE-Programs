package Array;

import java.util.Scanner;

public class LargestElement {
	
	public static int maxElement(int arr[]) {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(max<arr[i])
				max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = ob.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter the integer array elements");
		for(int i = 0; i<x; i++) {
			arr[i] = ob.nextInt();
		}
		int max = maxElement(arr);
		System.out.println("The largest Element in the array is "+ max);
		ob.close();
	}

}
