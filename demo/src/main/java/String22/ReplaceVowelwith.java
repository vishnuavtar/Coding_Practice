package String22;

import java.util.ArrayList;
import java.util.List;

public class ReplaceVowelwith {
	
	
	public static void main(String[] args) {
		
		
		String str = "This is a String";
		
		List<Character> list = new ArrayList<>();
		
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
