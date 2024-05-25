package Array99;

import java.util.Arrays;
import java.util.Comparator;

public class SLargets {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 100, 1, 2, 3, 4, 5, 6, 7, 7, 7 };

		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is empty"));

		System.out.println(aa);

	}

}
