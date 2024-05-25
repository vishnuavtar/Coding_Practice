package Number;

import java.util.Arrays;
import java.util.Comparator;

public class SLargest {

	public static void main(String[] args) {

		int a[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 99 };

		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalThreadStateException("Array is Empty"));

		System.out.println(aa);

		int b = 1234;

		int c = Integer.parseInt(new StringBuffer(String.valueOf(b)).reverse().toString());

		System.out.println(c);

		if (b == c) {
			System.out.println("Peindrome");
		} else {
			System.out.println("Not");
		}

	}

}
