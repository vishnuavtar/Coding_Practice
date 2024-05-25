package String32;

import java.util.List;

public class ReplaceFisrstVowel {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		String str2 = str.toLowerCase();
		
		List<Character> list = List.of('a','e','i','o','u');
		
		StringBuffer bb = new StringBuffer(str2);
		
		for(int i = 0; i<str2.length(); i++) {
			if(list.contains(str2.charAt(i))) {
				bb.setCharAt(i, '*');
				break;
			}
		}
		
		System.out.println(bb);
		
	}

}
