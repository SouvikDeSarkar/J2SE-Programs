package Array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = ob.nextInt();
		int arr[] = new int[x];
		int rev[] = new int[x];
		int j = x-1;
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<x; i++) {
			arr[i] = ob.nextInt();
			rev[j] = arr[i];
			j = j-1;
		}
		System.out.println("Elements of the orginal array");
		for(int i = 0; i<x; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Elements of the reversed array");
		for(int i = 0; i<x; i++) {
			System.out.print(rev[i]);
		}
		ob.close();
	}

}
