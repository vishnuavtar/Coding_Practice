package String31;

public class PelindromeString {
	
	public static void main(String[] args) {
		
		String str = "hhhhh";
		String str2 = str;
		String nstr = " ";
		
		char ch;
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		
		System.out.println(nstr);
		
		if(str2.equals(nstr)) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not Pelindrome");
		}
		
	}

}
