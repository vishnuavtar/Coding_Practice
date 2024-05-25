package String17;

public class Charactercount {

	public static void f1(String str) {

		int visited[] = new int[256];

		for (int i = 0; i < str.length(); i++) {

			visited[str.charAt(i)]++;

		}

		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);

			int count = 0;

			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j]) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println(str.charAt(i) + " = " + visited[str.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {

		String str = "This is my job job";

		f1(str);
	}

}
