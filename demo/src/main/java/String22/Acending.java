package String22;

public class Acending {
	
	public static void main(String[] args) {
		
		String str = "This is a String";
		
		char ch[] = str.toCharArray();
		
		for(int i = 0; i<str.length(); i++) {
			
			for(int j = i+1; j<str.length(); j++) {
				
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
						
			}
			
			
		}
		
		System.out.println(ch);
		
	}

}
