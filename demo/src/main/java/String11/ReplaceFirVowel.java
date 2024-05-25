package String11;

import java.util.List;

public class ReplaceFirVowel {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
		
		StringBuffer bew1 = new StringBuffer(str);
		
		for(int i = 0; i<str.length(); i++) {
			
			if(list.contains(str.charAt(i))) {
				bew1.setCharAt(i, '*');
				break;
			}
		}
		
		System.out.println(bew1);
	}

}
