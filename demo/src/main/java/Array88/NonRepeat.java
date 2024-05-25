package Array88;

public class NonRepeat {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 78, 1, 23, 23 };

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
