package String75;

public class MidUpLo {
	
	public static void main(String[] args) {
		
		String str = "This is Banaglore";
		
		int mid = str.length()/2;
		
		String upper = " ";
		String lower = " ";
		
		for(int i = 0; i<str.length(); i++) {
			if(i<mid) {
				lower = lower + Character.toLowerCase(str.charAt(i));
			}else {
				upper = upper + Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(lower);
		System.out.println(upper);
	}

}
