package String;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "This is  my job";
		String nstr = " ";
		char ch;
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		
		System.out.println(nstr);
		
//		StringBuilder b = new StringBuilder("This is");
//		b.reverse();
//		System.out.println(b);
	}

}
