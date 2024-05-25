package Array11;

import java.util.Arrays;

public class ArraySortAutomatic {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 51, 1, 6 };

		for (int i = 0; i < a.length; i++) {
			
			Arrays.sort(a);
			System.out.print(a[i]);
		}

	}

}
