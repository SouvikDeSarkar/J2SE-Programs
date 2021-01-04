package Array;

import java.util.Scanner;

public class SmallestElement {
	
	public static int minElement(int arr[]) {
		int min = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(min>arr[i])
				min = arr[i];
		}
		return min;
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
		int min = minElement(arr);
		System.out.println("The smallest Element in the array is "+ min);
		ob.close();

	}

}
