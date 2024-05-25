package String8;

public class NOnREpeat {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		char[] ch = new char[256];
		
		for(int i = 0; i<str.length(); i++) {
			ch[str.charAt(i)]++; 
		}
		
		for(int i = 0; i<256; i++) {
			if(ch[i]==1) {
				System.out.println((char)i);
			}
		}
		
	}

}
