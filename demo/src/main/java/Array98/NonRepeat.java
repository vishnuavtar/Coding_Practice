package Array98;

public class NonRepeat {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 };

		boolean chk;

		for (int i = 0; i < a.length; i++) {
			chk = false;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					chk = true;
				}
			}

			if (!chk) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
