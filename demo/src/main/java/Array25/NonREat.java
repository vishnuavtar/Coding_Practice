package Array25;

public class NonREat {

	public static void f1(int a[], int n) {

		boolean visited[] = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				continue;
			}

			int find = 0;
			for (int j = 0; j < n; j++) {
				if (a[i] == a[j]) {
					find++;
				}
			}

			if (find == 1) {
				System.out.println(a[i]);
			}
		}

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5 };

		int n = a.length;

		f1(a, n);

	}

}
