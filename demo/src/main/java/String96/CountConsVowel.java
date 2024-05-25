package String96;

import java.util.Scanner;

public class CountConsVowel {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String str2   = sc.nextLine();
		
		String str = str2.toLowerCase();
		
		int v = 0;
		int c = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a'  || str.charAt(i)=='e'  || str.charAt(i)=='i'  ||str.charAt(i)=='o' || str.charAt(i)=='u') {
				 v++;
			}else c++;
		}
	
		System.out.println(v);
		System.out.println(c);
		
	}

}
