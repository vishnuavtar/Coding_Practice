package String28;

public class Delete {
	
	public static void main(String[] args) {
		
		String str2 = "This is String";
		
		String str = str2.toLowerCase();
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='e') {
				continue;
			}
			
			System.out.println(str.charAt(i));
		}
		
	}

}
