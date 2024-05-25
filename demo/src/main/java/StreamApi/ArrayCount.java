package StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayCount {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 4, 5, 67, 8 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		Map<Integer, Long> map = Arrays.stream(aa)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}

}
