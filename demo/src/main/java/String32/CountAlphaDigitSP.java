package String32;

import java.util.Scanner;

public class CountAlphaDigitSP {
	
	public static void main(String[] args) {
		
		int a = 0;
	    int n = 0;
	    int s = 0;
		
		System.out.println("ENter Alpha Numeric Value");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z'|| str.charAt(i)>='A' && str.charAt(i)<='Z') {
				a++;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				n++;
			}else {
				s++;
			}
		}
		
		System.out.println("Alpha = " + a);
		System.out.println("Digit = " + n);
		System.out.print("sp = " + s);
		
	}

}
