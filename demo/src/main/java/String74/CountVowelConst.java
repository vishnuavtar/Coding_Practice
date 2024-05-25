package String74;

import java.util.Scanner;

public class CountVowelConst {
	
	public static void main(String[] args) {
		
		String str = "This is Banaglore";
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				count1++;
			}else {
				count2++;
			}
		}
		
		System.out.println(count1);
		System.out.println(count2);
	}

}
