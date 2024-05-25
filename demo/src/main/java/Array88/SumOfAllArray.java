package Array88;

import java.util.Arrays;

public class SumOfAllArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 78, 1, 23, 23 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		System.out.println(Arrays.stream(aa).mapToInt(Integer::new).sum());
	}

}
