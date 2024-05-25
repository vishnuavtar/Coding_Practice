package Array98;

import java.util.Arrays;

public class SumOfAllarray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		int aaa = Arrays.stream(aa).mapToInt(Integer::new).sum();

		System.out.println(aaa);
	}

}
