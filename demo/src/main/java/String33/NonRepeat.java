package String33;

public class NonRepeat {
	
	public static void f1(String str) {
		
		int a[] = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
			a[str.charAt(i)]++;
		}
		
		for(int i = 0; i<256; i++) {
			if(a[i]==1) {
				System.out.println((char)i);
			}
		}
		
	}

	public static void main(String[] args) {
		
		String str = "This is Bangalore Bangalore";
		
		f1(str);
		
	}
	
	
}
