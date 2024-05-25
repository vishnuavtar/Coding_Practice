package String24;

public class EachCharacter {

	public static void f1(String str) {

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];

		int find = 1;
		for (int i = 0; i < str.length(); i++) {

			count[i] = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {
				if (count[str.charAt(i)] == ch[j]) {
					find++;
				}
			}

			if (find == 1) {
				System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
			}
		}

	}

	public static void main(String[] args) {

		String str = "This is hyderabad";
		f1(str);

	}
}
