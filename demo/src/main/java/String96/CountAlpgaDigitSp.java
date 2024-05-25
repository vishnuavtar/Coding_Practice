package String96;

public class CountAlpgaDigitSp {
	
	
	public static void main(String[] args) {
		
		
		int alpha = 0;
		int sp = 0;
		int digit = 0;
		
		String str = "This is Bangalore 234";
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' ) {
				alpha++;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9' ) {
				digit++;
			}else {
				sp++;
			}
		}
		
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(sp);
		
	}

}
