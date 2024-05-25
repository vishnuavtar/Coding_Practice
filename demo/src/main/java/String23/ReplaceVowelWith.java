package String23;

import java.util.List;

public class ReplaceVowelWith {

	
	public static void main(String[] args) {
		
		String str = "This is String";
		
		List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
		
		StringBuffer b = new StringBuffer(str);
		
		for(int i = 0; i<str.length(); i++) {
			if(list.contains(str.charAt(i))) {
				b.setCharAt(i, '*');
				break;
			}
		}
		
		System.out.println(b);
		
	}
}
