package String86;

import java.util.Scanner;

public class CountAlphaDigitSp {

	public static void main(String[] args) {

		int digit = 0;
		int alpha = 0;
		int sp = 0;

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				alpha++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digit++;
			} else {
				sp++;
			}
		}

		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(sp);
	}

}
