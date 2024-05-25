package String99;

public class Printvowel {
	
	public static void main(String[] args) {
		
		String str2 = "This is Hyderabad";
		
		String str = str2.toLowerCase();
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
