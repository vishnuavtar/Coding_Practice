package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _ReplaceFirstVowel3 {
	
	public static void main(String[] args) {
		
		
		List<Character> ar = List.of('a','e','i','o','u','A','E','I','O','U');
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String - ");
		String a = sc.nextLine();
		
		StringBuffer bb = new StringBuffer(a);
		
		for(int i = 0; i<a.length(); i++) {
			if(ar.contains(a.charAt(i))) {
				bb.setCharAt(i, '-');
				//break;
			}
		}
		
		System.out.println( "After =  " + bb);
		
	}

}
