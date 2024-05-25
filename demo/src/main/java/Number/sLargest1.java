package Number;

import java.util.Arrays;
import java.util.Comparator;

public class sLargest1 {

	public static void main(String[] args) {

		int a[] = { 1, 1, 22, 3, 4, 5, 6, 7, 1, 2, 34, 5, 56, 1, 2, 3, 4, 5, 6, 7, 8, 10, 1, 2, 34, 5, 6, 7, 8, 88, 90,
				90 };

		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow( ()-> new IllegalStateException("Array is empty"));
		System.out.println(aa);
	}

}
