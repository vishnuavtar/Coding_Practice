package String78;

public class CountConsVowel {
	
	public static void main(String[] args) {
		
		int count1=0;
		int count2 = 0;
		
		String str = "This is Banaglore";
		String str2 = str.toLowerCase();
		for(int i = 0; i<str2.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
				count1++;
			}else {
				count2++;
			}
		}
		
		System.out.println(count1);
		System.out.println(count2);
	}

}
