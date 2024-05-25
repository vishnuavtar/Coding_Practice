package Array91;

import java.util.Arrays;

public class SomeOfAllArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		int all = Arrays.stream(aa).mapToInt(Integer::new).sum();

		System.out.println(all);
	}

}
