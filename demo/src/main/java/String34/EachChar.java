package String34;

public class EachChar {

	public static void f1(String str) {

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {

			count[str.charAt(i)]++;

		}

		char ch[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j]) {

				}
			}

			System.out.println(str.charAt(i) + " " + count[str.charAt(i)]);
		}

	}

	public static void main(String[] args) {

		String str = "This is bangalore";

		f1(str);

	}

}
