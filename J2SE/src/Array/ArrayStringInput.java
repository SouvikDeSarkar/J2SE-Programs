package Array;

import java.util.Scanner;

public class ArrayStringInput {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = ob.nextInt();
		String arr[] = new String[x];
		System.out.println("Enter the integer array elements");
		for(int i = 0; i<x; i++) {
			arr[i] = ob.next();
		}
		int j = 1;
		System.out.println("The elements of the array are : ");
		for(int i = 0; i<x; i++) {
			System.out.println(j+" "+arr[i]+" ");
			j++;
		}
		ob.close();

	}

}
