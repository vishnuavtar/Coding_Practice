package Array95;

import java.util.Arrays;
import java.util.Comparator;

public class SLargest {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4 ,1,2,3};

		int s = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is Empty"));

		System.out.println(s);
	}

}
