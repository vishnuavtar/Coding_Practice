package Array39;

public class NonRepeat {

	public static void main(String[] args) {

		int b[] = { 1, 2, 3, 1, 7, 8, 9, 43, 5, 7, 3322, 13, 45, 54, 54 };

		boolean chk;

		for (int i = 0; i < b.length; i++) {
			chk = false;
			for (int j = 0; j < b.length; j++) {
				if (i != j && b[i] == b[j]) {
					chk = true;

				}
			}

			if (!chk) {
				System.out.println(b[i] + " ");
			}
		}
	}

}
