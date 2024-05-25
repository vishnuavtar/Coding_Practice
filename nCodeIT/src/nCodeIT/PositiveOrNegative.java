package nCodeIT;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		System.out.println("Enter a Number --");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a >0) {
			System.out.println("Number is positive");
		} else if(a<0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is zero");
		}
	}

}
