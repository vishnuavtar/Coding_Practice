package String78;

public class Acending {

	
	public static void main(String[] args) {
		
		String str = "This is Banaglore";
		char ch[] = str.toCharArray();
		
		for(int i = 0; i<str.length(); i++) {
			for(int j = i+1; j<str.length(); j++) {
				if(Character.toLowerCase(ch[i])>Character.toLowerCase(ch[j])) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			
			System.out.print(ch[i] + " ");
		}
	}
}
