package Array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = ob.nextInt();
		int arr[] = new int[x];
		int sum = 0;
		System.out.println("Enter the integer array elements");
		for(int i = 0; i<x; i++) {
			arr[i] = ob.nextInt();
			sum += arr[i];
		}
		System.out.println("The sum of the elements of the array is "+sum);
		ob.close();
	}

}
