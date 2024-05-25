package String3;

public class NOnRepeat {

	public static void main(String[] args) {
		
		String str = "This is my job job";
		
		int ar[] = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
			ar[str.charAt(i)]++;
		}
		
		for(int i = 0 ; i<256; i++) {
			if(ar[i]==1) {
				System.out.println((char)i);
			}
		}
		
	}
	
}
