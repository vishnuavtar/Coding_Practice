package String85;

public class ReverseSplit {

	public static void main(String[] args) {

		String str = "This is Bangalore";

		String str2[] = str.split(" ");
		String str3 = " ";

		for (int i = str2.length - 1; i >= 0; i--) {
			str3 = str3 + str2[i];
		}

		System.out.println(str3);

		String nstr = " ";
		char ch;
		for (int i = 0; i < str3.length(); i++) {
			ch = str3.charAt(i);
			nstr = ch + nstr + "  ";
		}

		System.out.print(nstr + " \n ");

		String nstr2 = " ";

		char ch2;

		for (int i = 0; i < str.length(); i++) {
			ch2 = str.charAt(i);
			nstr2 = ch2 + nstr2;
		}

		//System.out.println(nstr2);

		String nstr3[] = nstr2.split(" ");

		String nstr4 = " ";

		for (int i = nstr3.length - 1; i >= 0; i--) {
			nstr4 = nstr4 + nstr3[i] + " ";
		}

		System.out.println(nstr4);
	}

}
