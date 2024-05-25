package String55;

import java.util.Scanner;

public class CountCOnsonentVowel {
	
	public static void main(String[] args) {
		
		int count = 0;
		int count1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str2 = str.toLowerCase();
		
		for(int i = 0; i<str2.length(); i++) {
			if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u') {
				count++;
			}else if(str2.charAt(i)>='a' && str2.charAt(i)<='z') {
				count1++;
			}
		}
		
		
		System.out.println(count);
		System.out.println(count1);
	}

}
