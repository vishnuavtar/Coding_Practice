package String18;

public class NonRepeat {
	
	public static void main(String[] args) {
		
		String str = "i am livinginhyderabad";
		
		int ch[] = new int[256];
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
