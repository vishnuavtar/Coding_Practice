package String98;

public class Pelindrome {

	public static void main(String[] args) {

		String str = "This is Hyerabad";

		String nstr = " ";

		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}

		System.out.println(nstr);

		if (nstr.contains(str)) {
			System.out.println("Pelindrome");
		} else {
			System.out.println("Not Pelindrome");
		}
	}

}
