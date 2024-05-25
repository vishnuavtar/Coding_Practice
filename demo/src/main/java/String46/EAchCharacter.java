package String46;

public class EAchCharacter {
	
	public static void main(String[] args) {
		
		String str = "This is String";
		int count[] = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
				count[str.charAt(i)]++;
		}
		
		char ch[] = new char[str.length()];
		
		int find = 1;
		
		for(int i = 0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			
			for(int j = i+1; j<=i; j++) {
				if(ch[i]==ch[j]) {
					find++;
				}
			}
			
			if(find==1) {
				System.out.println(str.charAt(i) + " " + count[str.charAt(i)]);
			}
		}
	}

}
