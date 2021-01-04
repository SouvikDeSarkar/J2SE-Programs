package Array;

import java.util.Scanner;

public class ReverseElements {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = ob.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter the integer array elements");
		for(int i = 0; i<x; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("The elements of the array are ");
		for(int i = 0; i<x; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The reverse elements of the array");
		for(int i = x-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		ob.close();

	}

}
