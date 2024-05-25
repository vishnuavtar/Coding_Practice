package String48;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		String nstr = " ";
		
		String temp = str;
		
		char ch;
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		
		System.out.println(nstr);
		
		if(nstr.contains(temp)) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not");
		}
	}

}
