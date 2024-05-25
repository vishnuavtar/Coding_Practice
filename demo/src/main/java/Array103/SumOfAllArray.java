package Array103;

import java.util.Arrays;

public class SumOfAllArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 11, 2, 3, 4, 6, 7, 10, 8, 9, 0 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		System.out.println(Arrays.stream(aa).mapToInt(Integer::new).sum());

		System.out.println(Arrays.stream(a).mapToDouble(Double::new).sum());
	}

}
