package StreamApi;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.stream(a).count());
		System.out.println(Arrays.stream(a).sum());

		int aaa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalStateException("not good"));

		System.out.println(aaa);
	}

}
