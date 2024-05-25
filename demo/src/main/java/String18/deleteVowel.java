package String18;

public class deleteVowel {

	
	public static void main(String[] args) {
		
		String str2 = "i am living in hyderabad";
		
		String str = str2.toLowerCase(); 
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				continue;
			}
			
			System.out.print(str.charAt(i));
		}
		
		
	}
}
