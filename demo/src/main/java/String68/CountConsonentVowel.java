package String68;

public class CountConsonentVowel {
	
	public static void main(String[] args) {
		
		int count = 0;
		int count2 = 0;
		String str2 = "This is Bangalore";
		String str = str2.toLowerCase();
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				count++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z' ) {
				count2++;
			}
		}
		
		System.out.println(count);
		System.out.println(count2);
	}

}
