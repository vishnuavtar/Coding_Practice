package Number;

import java.util.Arrays;
import java.util.Comparator;

public class Slargets {

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 2, 3, 3, 4, 4, 54, 56, 5, 6, 7, 8, 89, 9, 9, 9, 89 };

		int nn = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is Empty"));

		System.out.println(nn);

	}

}
