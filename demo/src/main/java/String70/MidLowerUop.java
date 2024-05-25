package String70;

public class MidLowerUop {
	
	public static void main(String[] args) {
		
		
		String str = "This is Bangalore";
		
		int str2 = str.length()/2;
		
		String lower = " ";
		String upper = " ";
		
		for(int i = 0; i<str.length(); i++) {
			if(i<str2) {
				 lower = lower+Character.toLowerCase(str.charAt(i));
			}else {
				upper = upper+Character.toUpperCase(str.charAt(i));
			}
		}
		
		
		System.out.println(lower);
		System.out.println(upper);
		
		System.out.println(lower+""+ upper);
	}

}
