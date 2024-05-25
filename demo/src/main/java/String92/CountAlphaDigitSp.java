package String92;

import java.util.Scanner;

public class CountAlphaDigitSp {

	public static void main(String[] args) {

		int alpha = 0;
		int digit = 0;
		int sp = 0;

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(str);

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
