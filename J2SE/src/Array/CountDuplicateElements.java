package Array;

import java.util.Scanner;

public class CountDuplicateElements {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = ob.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter the integer array elements");
		for(int i = 0; i<x; i++) 
			arr[i] = ob.nextInt();
		for(int i = 0; i<x; i++) {
			int count = 1;
			for(int j = i+1; j<x; j++) {
				if(arr[i] == arr[j]) 
					count++;
			}
			if(count>1)
			System.out.println("Duplicate element "+arr[i]+" is present "+count+" times ");
		}
		ob.close();

	}

}
