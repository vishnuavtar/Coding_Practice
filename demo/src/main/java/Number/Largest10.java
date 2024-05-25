package Number;

import java.util.Arrays;

public class Largest10 {

	public static int f1(int a[], int total) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b = a.length;
		System.out.println(f1(a, b));

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		System.out.println(Arrays.stream(aa).max(Integer::compare).get());

	}

}
