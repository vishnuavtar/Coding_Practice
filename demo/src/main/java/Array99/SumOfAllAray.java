package Array99;

import java.util.Arrays;

public class SumOfAllAray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 100, 1, 2, 3, 4, 5, 6, 7, 7, 7 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		System.out.println(Arrays.stream(aa).mapToInt(Integer::new).sum());
	}
}
