package String39;

import java.util.List;

public class ReplaceFirstVowel {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		List<Character> list = List.of('A','E','I','O','U','a','e','i','o','u');
		
		StringBuffer bb = new StringBuffer(str);
		
		for(int i = 0; i<str.length(); i++) {
			if(list.contains(str.charAt(i))) {
				bb.setCharAt(i, '*');
				break;
			}
		}
		
		System.out.println(bb);
	}

}
