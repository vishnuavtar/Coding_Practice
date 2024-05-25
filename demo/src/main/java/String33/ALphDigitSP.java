package String33;

import java.util.Scanner;

public class ALphDigitSP {

	public static void main(String[] args) {

		int a = 0;
		int d = 0;
		int sp = 0;

		System.out.println("Enter Alpha numeric value");

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				a++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				d++;
			} else {
				sp++;
			}
		}

		System.out.println("Alpha = " + a);
		System.out.println("Digit = " + d);
		System.out.print("Special = " + sp);
	}

}
