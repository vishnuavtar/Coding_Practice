package String18;

public class CharCount {

	public static void f1(String str) {

		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			ch[i] = str.charAt(i);

			int find = 0;

			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j]) {

					find++;
				}
			}

			if (find == 1) {
				System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {

		String str = "i am living in hyderabad";

		f1(str);
	}

}
