package String4;

public class Acending {

	
	public static void main(String[] args) {
		
		String str = "THis is my job";
		
		String str2 = str.toLowerCase();
		char[] ch = str2.toCharArray();
		
		for(int i = 0; i<str2.length(); i++) {
			
			for(int j = i+1; j<str2.length(); j++) {
				if(Character.toLowerCase(ch[i])>Character.toLowerCase(ch[j])) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			
			
		}
		
		System.out.println(String.valueOf(ch));
		
	}
}
