package Coding;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number -- ");
		int a = sc.nextInt();
		System.out.println(a);
		
		
		if (a == 0 || a == 1) {
			System.out.println("Not Prime Number");
		} else if (a == 2 || a == 3 || a == 5 || a == 7) {
			System.out.println("Prime Number");
		} else if (a % 2 == 0 || a % 3 == 0 || a % 4 == 0 || a % 5 == 0 || a % 6 == 0 || a % 7 == 0 || a % 8 == 0
				|| a % 9 == 0) {
			System.out.println("Not Prime number");
		}
	}
	

}
