package String54;

public class PrintVowel {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		String str2 = str.toLowerCase();
		
		for(int i = 0; i<str2.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				System.out.println(str.charAt(i));
			}
		}
	}

}
