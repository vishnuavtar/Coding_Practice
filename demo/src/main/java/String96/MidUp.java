package String96;

public class MidUp {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		String lower = "";
		String upper = "";
		int mid = str.length()/2;
		
		for(int i = 0; i<str.length(); i++) {
			if(i<mid) {
				lower = lower + Character.toLowerCase(str.charAt(i));
			}else {
				upper = upper + Character.toUpperCase(str.charAt(i));
			}
		}
		
		
		System.out.println(lower + upper);
	}

}
