package Array96;

import java.util.Arrays;
import java.util.Comparator;

public class SLargest {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 1, 2, 3, 4, 6, 7, 89, 90, 89, 90, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int s = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Exception Hapend"));

		System.out.println(s);
	}

}
