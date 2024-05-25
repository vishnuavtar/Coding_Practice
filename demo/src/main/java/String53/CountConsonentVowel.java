package String53;

public class CountConsonentVowel {
	
	public static void main(String[] args) {
		
		String str2 = "This is Bangalore";
		String str = str2.toLowerCase();
		char ch;
		int count = 0;
		int count1 = 0;
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}else if(ch>='a' || ch<='z') {
				count1++;
			}
		}
		
		System.out.println(count);
		System.out.println(count1);
		
	}

}
