package String49;

public class CountConsonent {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		String str2 = str.toLowerCase();
		char ch;
		int count = 0;
		int count2 = 0;
		for(int i = 0; i<str.length(); i++) {
			ch = str2.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
				count++;
			}else if(ch>'a' && ch<'z') {
				count2++;
			}
			
			
		}
		System.out.println("Vowel" + count);
		System.out.println("Consonent" + count2);
		
	}

}
