package String38;

import java.util.List;

public class ReplaceFirstVowel {
	
	public static void main(String[] args) {
		
		String str = "This is Vowel";
		
		List<Character> ls = List.of('A','E','I','O','U','a','e','i','o','u');
		
		StringBuffer bb = new StringBuffer(str);
		
		for(int i = 0; i<str.length(); i++) {
			if(ls.contains(str.charAt(i))) {
				bb.setCharAt(i, '*');
				break;
			}
		}
		
		System.out.println(bb);
		
	}

}
