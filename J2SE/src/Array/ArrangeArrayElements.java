package Array;

import java.util.Scanner;

public class ArrangeArrayElements {
	
	public static int[] ascending (int arr[]) {
		int as[] = arr;
		int temp;
		for(int i = 0; i<as.length; i++) {
			for(int j = i+1; j<as.length; j++) {
				if(as[i] > as[j]) {
					temp = as[i];
					as[i] = as[j];
					as[j] = temp;
				}
			}
		}
		return as;	
	}
	
	public static int[] descending(int arr[]) {
		int ds[] = arr;
		int temp;
		for(int i = 0; i<ds.length; i++) {
			for(int j = i+1; j<ds.length; j++) {
				if(ds[i] < ds[j]) {
					temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		return ds;	
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
		int as[] = ascending(arr);
		System.out.println("The array in ascending order is ");
		for(int i = 0; i<as.length; i++) {
			System.out.print(as[i]+ " ");
		}
		System.out.println();
		int ds[] = descending(arr);
		System.out.println("The array in descending order is ");
		for(int i = 0; i<ds.length; i++) {
			System.out.print(ds[i]+ " ");
		}
		
		ob.close();
	}

}
