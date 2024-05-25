package String59;

public class ReversePelindrome {
	
	public static void main(String[] args) {
		
		String str = "iii";
		
		String nstr = " ";
		char ch;
		String temp = str;
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		
		System.out.println(nstr);
		
		if(nstr.contains(temp)) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not Pelindrome");
		}
	}

}
