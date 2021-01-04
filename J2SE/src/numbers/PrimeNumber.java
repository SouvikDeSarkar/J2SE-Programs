package numbers;

import java.util.Scanner;

public class PrimeNumber {
	
	public void prime(int n) {
		boolean x = false;
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				x = true;
				break;
			}
		}
		if (x == true) {
			System.out.println("Not a prime number");
		}
		else 
			System.out.println("Prime Number");
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please enter the number to check the prime number");
		Scanner ob = new Scanner(System.in);
		int m = ob.nextInt();
		
		PrimeNumber x = new PrimeNumber();
		x.prime(m);

	}

}
