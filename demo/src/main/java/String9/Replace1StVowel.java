package String9;

import java.util.List;
import java.util.Scanner;

public class Replace1StVowel {
	
	public static void main(String[] args) {
		
		List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String -- ");
		String str = sc.nextLine();
		
		StringBuffer new1 = new StringBuffer(str);
		
		for(int i = 0; i<str.length(); i++) {
			if(list.contains(str.charAt(i))) {
				new1.setCharAt(i, '-');
				break;
				
			}
		}
		
		System.out.println(new1);
		
	}

}
