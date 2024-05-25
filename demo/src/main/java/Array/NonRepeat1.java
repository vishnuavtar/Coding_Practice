package Array;

public class NonRepeat1 {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		int[] a = new int[256];
		
		for(int i = 0; i<a.length; i++) {
			a[str.charAt(i)]++;
		}
		
		for(int i = 0; i<256; i++) {
			if(a[i]==1) {
				System.out.println((char)i);
			}
		}
		
	}

}
