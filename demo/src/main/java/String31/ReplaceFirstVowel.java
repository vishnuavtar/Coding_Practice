package String31;

import java.util.ArrayList;
import java.util.List;

public class ReplaceFirstVowel {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		List<Character> list = List.of('a','e','i','o','u');
		
		StringBuffer b = new StringBuffer(str);
		
		for(int i = 0; i<str.charAt(i); i++) {
			if(list.contains(str.charAt(i))) {
				b.setCharAt(i, '-');
				break;
			}
		}
		
		System.out.println(b);
	}

}
