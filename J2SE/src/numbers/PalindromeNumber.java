package numbers;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static int reverse(int n) {
		int rev = 0;
		while(n != 0) {
			int dig = n%10;
			rev = rev * 10 + dig;
			n/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome");
		int n = ob.nextInt();
		int rev = reverse(n);
		if(n == rev)
			System.out.println("The number entered is palindrome");
		else 
			System.out.println("The number enterned is not a palindrome");
		ob.close();

	}

}
