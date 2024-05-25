package StreamApi;

import java.util.Arrays;

public class OddEvenSum5 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 2 };

		int e = Arrays.stream(a).filter(i -> i % 2 == 0).sum();
		int o = Arrays.stream(a).filter(i -> i % 2 != 0).sum();

		System.out.println(e);
		System.out.println(o);
	}

}
