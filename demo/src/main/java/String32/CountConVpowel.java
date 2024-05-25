package String32;

public class CountConVpowel {

	
	public static void main(String[] args) {
		
		String str = "This is BAnaaqgalq11oorerr";
		String str2 = str.toLowerCase();
		int v = 0;
		int c = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				v++;
			}else {
				c++;
			}
		}
		
		System.out.println("Vowel = " + v);
		System.out.println("cons = " + c);
	}
}
