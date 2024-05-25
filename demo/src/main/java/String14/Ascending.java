package String14;

public class Ascending {
	
	public static void main(String[] args) {
		
		String str2 = "This is my job";
		char[] str = str2.toCharArray();
		
		for(int i = 0; i<str2.length(); i++) {
			for(int j = i+1; j<str2.length(); j++) {
				
				if(Character.toLowerCase(str[i])>Character.toLowerCase(str[j])) {
					char temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				
			}
			
			
		}
		
		System.out.println(String.valueOf(str));
		
	}

}
