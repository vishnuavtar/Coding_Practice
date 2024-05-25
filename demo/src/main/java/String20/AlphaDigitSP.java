package String20;

import java.util.Scanner;

public class AlphaDigitSP {
	
	public static void main(String[] args) {
		
		int alpha = 0;
		int digit = 0;
		int sp = 0;
		
		System.out.println("Enter alpha numeric values : -");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z') {
				alpha++;
			}else if (str.charAt(i)>='0' && str.charAt(i)<='9') {
				digit++;
			}else {
				sp++;
			}
		}
		
		System.out.println("Alpha = " + alpha);
		System.out.println("Digit = " + digit);
		System.out.println("SP = " + sp);
		
	}

}
