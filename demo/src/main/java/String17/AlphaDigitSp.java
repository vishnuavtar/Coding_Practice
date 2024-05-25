package String17;

import java.util.Scanner;

public class AlphaDigitSp {

	public static void main(String[] args) {

		int sp = 0;
		int alpha = 0;
		int digit = 0;

		char ch;

		System.out.println("Enter Number alpha numeric");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for(int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alpha++;
			}
			else if(ch >= '0' && ch <= '9') {
				digit++;
			}
			else {
				sp++;
			}
		}		

		System.out.println("Alpha = " + alpha);
		System.out.println("Digit = " + digit);
		System.out.println("Sp = " + sp);

	}
}
