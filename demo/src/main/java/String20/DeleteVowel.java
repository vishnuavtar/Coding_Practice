package String20;

public class DeleteVowel {
	
	public static void main(String[] args) {
		
		
		String str2 = "This is a city";
		
		String str =  str2.toLowerCase();
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				continue;
			}
			
			System.out.print(str.charAt(i));
		}
		
	}

}
