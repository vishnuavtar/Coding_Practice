package String11;

import java.util.Scanner;

public class CountDigitAlphasp {
	
	public static void main(String[] args) {
		
		int alph;
		int digit;
		int sp;
		
		alph = digit = sp = 0;
		
		char ch; 
		
		System.out.println("Enter alphaNumeric word === ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)>'a' && str.charAt(i)<'b' || str.charAt(i)>'A' && str.charAt(i)<'B') {
				alph++;
			}else if(str.charAt(i)>'0' && str.charAt(i)<'9') {
				digit++;
			}else {
				sp++;
			}
		}
		
		System.out.println("alpha = " + alph);
		System.out.println("digit = " + digit);
		System.out.println("sp = " + sp);
	}

}
