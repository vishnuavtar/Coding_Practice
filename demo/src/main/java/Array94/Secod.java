package Array94;

import java.util.Arrays;
import java.util.Comparator;

public class Secod {

	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12 ,12};
		int secondHighest = Arrays.stream(array).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is empty or contains only one element"));

		System.out.println(secondHighest);
	}
}
