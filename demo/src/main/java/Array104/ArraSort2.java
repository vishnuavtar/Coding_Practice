package Array104;

import java.util.Arrays;

public class ArraSort2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 11, 2, 3, 4, 6, 7, 10, 8, 9, 0 };

		Arrays.stream(a).sorted().forEach(System.out::print);

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

			System.out.println(a[i] + " ");
		}
	}

}
