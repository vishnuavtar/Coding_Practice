package String10;

public class MaxOccure {

	static int f1(String str) {

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		int max = -1;
		char result = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;

	}

	public static void main(String[] args) {

		String str = "This is my job";

		System.out.println(f1(str));

	}

}
