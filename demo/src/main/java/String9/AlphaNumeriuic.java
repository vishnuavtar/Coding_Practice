package String9;

import java.util.Scanner;

public class AlphaNumeriuic {
	
	public static void main(String[] args) {
		int digit,alpha,sp;
		digit=alpha=sp=0;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length(); i++) {
			ch= str.charAt(i);
			
			if(ch>'a' && ch<'z' || ch>'A' && ch<'Z') {
				alpha++;
			}else if(ch>'0' &&ch<'9') {
				digit++;
			}else {
				sp++;
			}
		}
		
		System.out.println("digit = " + digit);
		System.out.println("Alpha = " + alpha);
		System.out.println("sp = " + sp);
	}

}
