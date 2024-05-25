package String3;

public class DeleteVowel {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		String str2 = str.toLowerCase();
		
		for(int i = 0; i<str2.length(); i++) {
			if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u') {
				continue;
			}
			
			System.out.println(str2.charAt(i));
		}
		
	}

}
