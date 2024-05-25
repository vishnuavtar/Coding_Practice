package String31;

public class CountVowel { 
	
	public static void main(String[] args) {
		
		
		String str = "This is Bangalore";
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i<str.length(); i++) {
			
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					count1++;
				}else if(str.charAt(i)>='a' || str.charAt(i)<='z') {
					count2++;
				}
				
				
			
		}
		
		System.out.println("vowel"+count1);
		System.out.println("consonent"+count2);
		
	}
	
	
	
	
	
	

}
