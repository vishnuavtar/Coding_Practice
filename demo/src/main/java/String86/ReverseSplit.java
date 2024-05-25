package String86;

public class ReverseSplit {

	public static void main(String[] args) {

		String str = "This is Bangalore";

		String str2[] = str.split(" ");

		String str3 = " ";

		for (int i = str2.length - 1; i >= 0; i--) {
			str3 = str3 + str2[i];
		}

		System.out.println(str3);

		char ch;

		String nstr = " ";
		for (int i = 0; i < str3.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}

		System.out.println(nstr);

		String str4[] = nstr.split(" ");

		String str5 = " ";
		for (int i = str4.length - 1; i >= 0; i--) {
			str5 = str5 + str4[i] + " ";
		}

		System.out.println(str5);
	}
}
