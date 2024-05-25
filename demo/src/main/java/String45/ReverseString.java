package String45;

public class ReverseString {

	public static void main(String[] args) {

		String str = "This is Bangalore";

		String nstr = " ";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}

		System.out.println(nstr);
	}

}
