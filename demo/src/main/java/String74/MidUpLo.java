package String74;

public class MidUpLo {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		String str2 = str.toLowerCase();
		
		int mid = str2.length()/2;
		
		String upper = " ";
		String lower = " ";
		
		for(int i = 0; i<str2.length(); i++) {
			if(i<mid) {
				lower = lower + Character.toLowerCase(str.charAt(i));

			}else {
				upper = upper+Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(lower);
		System.out.println(upper);
	}

}
