package String82;

public class CountConstVowel {
	
	public static void main(String[] args) {
		
		int vowel = 0;
		int consto = 0;
		
		String str = "This is Banaglore";
		String str2 = str.toLowerCase();
		
		for(int i = 0; i<str2.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel++;
			}else {
				consto++;
			}
		}
		
		System.out.println(vowel);
		System.out.println(consto);
		
	}

}
