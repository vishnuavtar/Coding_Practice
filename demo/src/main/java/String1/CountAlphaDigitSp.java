package String1;

import java.util.Scanner;

public class CountAlphaDigitSp {
	

	
	public static void main(String[] args) {
		
		 int sp; int digit; int alpha; 
		 char ch;
		 
		sp=digit=alpha=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		 String str = sc.nextLine();
		 
		 for(int i = 0; i<str.length(); i++) {
			 ch = str.charAt(i);
			 if(str.charAt(i)>'A' && str.charAt(i)<'Z' || str.charAt(i)>'a' && str.charAt(i)<'z') {
				alpha++;
			 }else if(str.charAt(i)>'0' && str.charAt(i)<'9') {
				 digit++;
			 }else {
				 sp++;
			 }
		
	}	
		 
		 System.out.println("alpha = " + alpha);
		 System.out.println("Digit = " + digit);
		 System.out.println("sp = " + sp);
		
		
	}

}
