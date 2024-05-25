package Array103;

import java.util.Arrays;
import java.util.Comparator;

public class SLargest {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 11, 2, 3, 4, 6, 7, 10, 8, 9, 0 ,100,100,101,101};

		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is Empty"));

		System.out.println(aa);
	}

}
