package String49;

import java.util.Scanner;

public class CountAlphaDigitSP {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int alpha = 0;
		int digit=0;
		int sp=0;
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='b' || ch>='A' && ch<='Z') {
				alpha++;
			}else if(ch>='0' && ch<='9') {
			 digit++;
			}else {
				sp++;
			}
		}
		
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(sp);
	}

}
