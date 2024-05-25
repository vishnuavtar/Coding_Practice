package StreamApi;

import java.util.Arrays;

public class SumEvenOdd1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 5 };

		System.out.println(Arrays.stream(a).filter(i -> i % 2 == 0).mapToLong(Integer::new).sum());
		System.out.println(Arrays.stream(a).filter(i -> i % 2 != 0).mapToLong(Integer::new).sum());
	}

}
