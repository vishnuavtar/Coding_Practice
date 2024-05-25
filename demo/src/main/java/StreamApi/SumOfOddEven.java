package StreamApi;

import java.util.Arrays;
import java.util.List;

public class SumOfOddEven {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5);

		System.out.println(list);

		int a[] = list.stream().mapToInt(Integer::new).toArray();

		System.out.println(Arrays.toString(a));

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		int even = Arrays.stream(aa).filter(i -> i % 2 == 0).mapToInt(Integer::new).sum();

		int odd = Arrays.stream(aa).filter(i -> i % 2 != 0).mapToInt(Integer::new).sum();

		System.out.println(even);
		System.out.println(odd);
	}

}
