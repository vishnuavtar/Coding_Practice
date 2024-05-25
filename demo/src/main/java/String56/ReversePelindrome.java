package String56;

public class ReversePelindrome {
	
	public static void main(String[] args) {
		
		String str = "iii";
		String temp = str;
		String nstr = " ";
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
