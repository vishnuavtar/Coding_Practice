package Number;

import java.util.Arrays;
import java.util.Comparator;

public class SLargest3 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 4, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 6, 10, 10, 1, 2, 3, 4, 6, 7, 8, 9, 0, 1, 1, 1, 2, 3,
				4, 5, 67 };

		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("Array is Empty"));
	
		
		System.out.println(aa);
	
	}

}
