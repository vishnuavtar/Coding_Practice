package Array104;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dublicate {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 23, 4, 5, 6, 7, 1,8 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		Arrays.stream(aa).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::print);
	}

}
