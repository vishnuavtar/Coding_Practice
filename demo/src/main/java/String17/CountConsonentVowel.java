package String17;

import java.util.Scanner;

public class CountConsonentVowel {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String : - ");
		Scanner sc = new Scanner(System.in);
		
		
		int count1  = 0;
		int count2 = 0;
		
		String str = sc.nextLine();
		
		String str2 = str.toLowerCase();
		
		for(int i = 0; i<str.length(); i++) {
		
			if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u') {
				count1++;
			}else  if(str2.charAt(i)>'a' || str2.charAt(i)<='z'){
				count2++;
				
			}
		}
		
		System.out.println("Vowel = " + count1);
		System.out.println("Consonent = " + count2);
		
	}

}
