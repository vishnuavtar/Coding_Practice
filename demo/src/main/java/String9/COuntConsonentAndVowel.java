package String9;

public class COuntConsonentAndVowel {
	
	public static void main(String[] args) {
		
		String str2 = "This is my job";
		String str = str2.toLowerCase();
		
		int count1=0;
				int count2=0;
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
				count1++;
			}else if(str.charAt(i)>'a' || str.charAt(i)<'z') {
				count2++;
			}
		}
		
		System.out.println("Vowel is = " + count1);
		System.out.println("Consonent is = " + count2);
		
	}

}
