package String8;

public class DeleteVowel {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				continue;
			}
			
			System.out.println(str.charAt(i));
		}
		
	}

}
