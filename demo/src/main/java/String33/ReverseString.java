package String33;

public class ReverseString {
	
	public static void main(String[] args) {
		
	String str = "This is Bangalore";
	String temp = str;
	String nstr = " ";
	char ch;
	
	for(int i = 0; i<str.length(); i++) {
		ch = str.charAt(i);
		
		nstr = ch+nstr;
	}
	
	System.out.println(nstr);
	
	if(temp.contains(nstr)) {
		System.out.println("Pelindrome");
	}else {
		System.out.println("Not Pelindrome");
	}
	
	
		
	}

}
