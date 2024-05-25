package String46;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		String nstr = " ";
		char ch;
		String str2 = str;
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		
		System.out.println(nstr);
		
		if(nstr.contains(str2)) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not");
		}
	}

}
