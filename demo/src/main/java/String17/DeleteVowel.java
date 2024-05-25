package String17;

import java.util.Scanner;

public class DeleteVowel {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String :- ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = str.toLowerCase();
		for(int i = 0; i<str.length(); i++) {
			if(str2.charAt(i)=='a' || str2.charAt(i)=='e' ||str2.charAt(i)=='i' ||str2.charAt(i)=='o' ||str2.charAt(i)=='u') {
				continue;
			}
			
			System.out.print(str.charAt(i));
		}
		
		
	}

}
