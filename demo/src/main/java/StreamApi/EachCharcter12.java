package StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharcter12 {

	public static void main(String[] args) {

		String str = "This is Hyderabad";

		Map map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);

	}
}
