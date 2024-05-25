package nCodeIt2;

// Task10: Write a Java program to print all the LEADERS in the array.

public class LadersElmentsinArray {

	static void f1(int a[], int n) {

		int j;
		for (int i = 0; i < a.length; i++) {
			for (j = i + 1; j < n; j++) {

				if (a[i] <= a[j]) {
					break;
				}
			}

			if (j == n) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 34, 65, 23, 676, 23, 86, 324, 23, 8, 5, 4, 1, 2, 3, 4 };
		int n = a.length;
		f1(a, n);

	}
}
