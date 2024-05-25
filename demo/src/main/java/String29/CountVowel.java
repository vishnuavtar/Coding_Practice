package String29;

public class CountVowel {

	
	public static void main(String[] args) {
		
		String str2 = "This is String";
		String str = str2.toLowerCase();
		int count = 0;
		int count1 = 0;
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				count++;
			}else if(str.charAt(i)>='a' || str.charAt(i)<= 'z') {
				count1++;
			}
			
			
		}
		
		System.out.println("Vowel" + count);
		System.out.println("Consonent " + count1);
	}
}
