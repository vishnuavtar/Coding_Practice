package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraysEachCharacter2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		int a[] = list.stream().mapToInt(Integer::intValue).toArray();
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Map<Integer, Long> map = Arrays.stream(aa)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);

	}

}
