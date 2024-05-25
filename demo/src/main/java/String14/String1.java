package String14;

import java.util.List;

public class String1 {
	
	public static void main(String[] args) {
		
		
		List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
		
		String str = "This is my job";
		
		
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
