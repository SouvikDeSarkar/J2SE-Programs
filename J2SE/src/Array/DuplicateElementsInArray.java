package Array;

import java.util.Scanner;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = ob.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter the integer array elements");
		for(int i = 0; i<x; i++) {
			arr[i] = ob.nextInt();
		}
		System.out.println("Duplicate elements are ");
		for(int i = 0; i<x; i++) {
			for(int j = i+1; j<x; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}	
		}
		ob.close();
	}
}
