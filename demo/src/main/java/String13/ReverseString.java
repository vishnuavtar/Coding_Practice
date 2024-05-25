package String13;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String nstr = " ";
		char ch;
		String str = "This is my job";
		
		for(int i = 0; i<str.length(); i++) {
			ch =str.charAt(i);
			nstr = ch+nstr;
		}
		
		System.out.println(nstr);
		
	}

}
