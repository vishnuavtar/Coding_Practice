package String16;

import java.util.Scanner;

public class DigitAlphaSp {

	public static void main(String[] args) {

		int digit = 0;
		int sp = 0;
		int alph = 0;

		System.out.println("Enter Alpha Numeric : -");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alph++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				sp++;
			}

		}

		System.out.println("Digit = " + digit);
		System.out.println("Alpha = " + alph);
		System.out.println("sp = " + sp);

	}

}
