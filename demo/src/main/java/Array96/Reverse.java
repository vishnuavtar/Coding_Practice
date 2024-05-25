package Array96;

public class Reverse {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 4, 5, 6, 7, 78, 8, 1, 23, 4 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}

			System.out.print(a[i] + " ");
		}

	}

}
