package Array94;

import java.util.Arrays;
import java.util.Comparator;

public class Second {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 2, 8, 8, 9, 9 };

		System.out.println(Arrays.stream(a).count());

		int s = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is empty"));

		System.out.println(s);
	}

}
