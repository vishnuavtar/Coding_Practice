package String90;

public class ReverseSplit {

	public static void main(String[] args) {

		String str = "This is Bangalore";

		String nstr = " ";

		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}

		System.out.println(nstr);

		String str2[] = nstr.split(" ");
		String str3 = " ";
		for (int i = str2.length - 1; i >= 0; i--) {
			str3 = str3 + str2[i]+" ";
		}

		System.out.println(str3);

	}

}
