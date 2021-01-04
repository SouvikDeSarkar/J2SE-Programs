package Array;

import java.util.Scanner;

public class SumEvenOddElements {
	
	public static int[] evenoddSum(int arr[]) {
		int eoSum[] = new int[4];
		int eCount = 0, oCount = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				eoSum[0] += arr[i];
				eCount++;
			}
			else {
				eoSum[1] += arr[i];
				oCount++;
			}
		}
		eoSum[2] = eCount;
		eoSum[3] = oCount;
		return eoSum;
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
		int eoSum[] = evenoddSum(arr);
		System.out.println("The number of even elements in the input array "+ eoSum[2]);
		System.out.println("The sum of even elements in the input array "+ eoSum[0]);
		System.out.println("The number of odd elements in the input array "+ eoSum[3]);
		System.out.println("The sum of odd elements in the input array "+ eoSum[1]);
		ob.close();
	}

}
