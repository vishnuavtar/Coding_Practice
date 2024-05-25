package StreamApi;

import java.util.Arrays;

public class EVenOddSum2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int even = (int) Arrays.stream(a).filter(i -> i % 2 == 0).mapToDouble(Integer::new).sum();
		int odd = (int) Arrays.stream(a).filter(i -> i % 2 != 0).mapToDouble(Integer::new).sum();

		System.out.println(even);
		System.out.println(odd);
	}

}
