package StreamApi;

import java.util.Arrays;

public class OddEvenSum4 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 10, 8, 9 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		Integer even = Arrays.stream(aa).filter(i -> i % 2 == 0).mapToInt(Integer::new).sum();
		Integer odd = Arrays.stream(aa).filter(i -> i % 2 != 0).mapToInt(Integer::new).sum();

		System.out.println(even);
		System.out.println(odd);
	}

}
