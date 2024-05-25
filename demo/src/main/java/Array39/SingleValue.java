package Array39;

public class SingleValue {

	public static void main(String[] args) {

		int b[] = { 1, 2, 3, 1, 7, 8, 9, 43, 5, 7, 3322, 13, 45, 54, 54 };

		boolean ch;

		for (int i = 0; i < b.length; i++) {
			ch = false;

			for (int j = i + 1; j < b.length; j++) {

				if (i != j && b[i] == b[j]) {
					ch = true;

				}
			}

			if (!ch) {
				System.out.println(b[i] + " ");
			}
		}
	}

}
