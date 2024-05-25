package String10;

import java.util.Scanner;

public class AlphaDigiSpe {

	public static void main(String[] args) {

		int digit, sp, alpha;
		digit = sp = alpha = 0;
		System.out.println("Enter Anything --");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)>'a' && str.charAt(i)<'z' || str.charAt(i)>'A' && str.charAt(i)<'Z') {
				alpha++;
			}else if(str.charAt(i)>'0' && str.charAt(i)<'9') {
				digit++;
			}else {
				sp++;
			}
		}
		
		System.out.println(alpha + " \n " + digit + " \n "  + sp);

	}

}
