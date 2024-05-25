package String92;

public class ReverseSplit {

	public static void main(String[] args) {

		String str = "This is Hyderabad";
		String str3 = " ";
		String str2[] = str.split(" ");

		for (int i = str2.length - 1; i >= 0; i--) {
			str3 = str3 + str2[i] + " ";
		}

		System.out.println(str3);

		String nstr = " ";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}

		System.out.println(nstr);

		String str4 = " ";

		String str5[] = nstr.split(" ");

		for (int i = str5.length - 1; i >= 0; i--) {
			str4 = str4 + str5[i] + " ";
		}

		System.out.println(str4);
	}

}
