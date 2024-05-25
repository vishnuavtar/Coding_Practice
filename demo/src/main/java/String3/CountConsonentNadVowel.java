package String3;

public class CountConsonentNadVowel {
	
	public static void main(String[] args) {
		
		String str = "This is My job";
		String str2  = str.toLowerCase();
		
		int count1=0;
		int count2=0;
		
		for(int i = 0; i<str2.length(); i++) {
			if(str2.charAt(i)=='a' ||  str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u') {
				count1++;
				System.out.println("Vowel = " + str2.charAt(i));
			}else if(str2.charAt(i)>'a' || str2.charAt(i)<'z') {
				count2++;
				System.out.println("Consonent  = " + str2.charAt(i));
			}
		}
		
		System.out.println("Vowel is = " + count1);
		System.out.println("Consonent is = " + count2);
	}

}
