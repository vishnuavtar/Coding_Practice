package String;

import java.util.*;
public class CountConsonentVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter String");
		String str1 = sc.nextLine();
		int count1=0;
		int count2=0;
		for(int i = 0; i<str1.length(); i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' ||str1.charAt(i)=='i' ||str1.charAt(i)=='o' ||str1.charAt(i)=='u') {
					count1++;
			}else if(str1.charAt(i)>'a' || str1.charAt(i)<'z') {
				count2++;
			}
		} 
		
		System.out.println("Vowel is  = " + count1);
		System.out.println("Cons = " + count2);
	}
	
	


}
