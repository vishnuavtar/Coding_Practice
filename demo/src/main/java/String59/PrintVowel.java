package String59;

public class PrintVowel {
	
	public static void main(String[] args) {
		
		String str2 = "This is Bangalore";
		
		String str = str2.toLowerCase();
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
			}
		}
	}

}
