package Array98;

import java.util.Arrays;
import java.util.Comparator;

public class SlArgest {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 };

		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is empty"));

		System.out.println(aa);

	}

}
