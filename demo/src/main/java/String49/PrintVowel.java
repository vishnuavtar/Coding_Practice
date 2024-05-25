package String49;

public class PrintVowel {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		String str2 = str.toLowerCase();
		
		char ch;
		for(int i = 0; i<str2.length(); i++) {
			
			 ch = str2.charAt(i);
			 
			 if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ) {
				 System.out.println(str2.charAt(i));
			 }
		}
	}

}
