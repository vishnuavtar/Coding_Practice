package String1;

import java.util.List;

public class ReplaceFirstVowel {
	
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
		
		StringBuffer new1 = new StringBuffer(str);
		
		for(int i = 0; i<str.length(); i++) {
			
			if(list.contains(str.charAt(i))) {
				new1.setCharAt(i, '*');
				break;
			}
		}
		
		System.out.println(new1);
		
	}

}
