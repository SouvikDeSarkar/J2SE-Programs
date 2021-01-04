package numbers;

import java.util.Scanner;

public class OblongNumber {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number to check its a oblong number or not");
		int n = ob.nextInt();
		int flag = 0;
		for(int i = 0; i<n; i++) {
			if(i*(i+1) == n) {
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			System.out.println("The entered number is a oblong number");
		else 
			System.out.println("The entered number is NOT a oblong number");

		ob.close();

	}

}
