package String50;

public class NOnREpeat {

	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
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
}
