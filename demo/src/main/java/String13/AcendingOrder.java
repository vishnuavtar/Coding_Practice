package String13;

import String11.charactercount;

public class AcendingOrder {
	
	public static void main(String args[]) {
		
		String str = "This is my job";
		char[] ch  =str.toCharArray();
		
		for(int i = 0; i<str.length(); i++) {
			for(int j = i+1; i<str.length(); i++) {
				if(Character.toLowerCase(ch[i])>Character.toLowerCase(ch[j])) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j]  = temp;
				}
			}
			
			System.out.println(String.valueOf(ch));
		}
	}
}
