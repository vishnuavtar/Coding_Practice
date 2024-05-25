package String25;

public class NonRepeat {
	
	public static void main(String[] args) {
		
		String str = "This is String";
		int a[] = new int[256];
		
		
		for(int i = 0; i<str.charAt(i); i++) {
			a[str.charAt(i)]++;
		}
		
		for(int i= 0; i<256; i++) {
			if(a[i]==1) {
				System.out.println((char)i);
			}
		}
		
	}

}
