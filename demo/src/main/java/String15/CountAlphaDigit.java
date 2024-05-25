package String15;

import java.util.Scanner;

public class CountAlphaDigit {
	
	public static void main(String[] args) {
		
	 int alpha,digit,sp;
	 alpha=digit=sp=0;
	 
	 System.out.println("ENter Anythings :-");
	 Scanner sc = new Scanner(System.in);
	 String str = sc.nextLine();
	 
	 for(int i = 0; i<str.length(); i++) {
		 if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
		 {
			 alpha++;
		 }else if(str.charAt(i)>='1' && str.charAt(i)<='9') {
			 digit++;
		 }else {
			 sp++;
		 }
	 }
	 
	 System.out.println("Alpha = " + alpha);
	 System.out.println("Digit = " + digit);
	 System.out.println("Sp = " + sp);
	 
	}

}
