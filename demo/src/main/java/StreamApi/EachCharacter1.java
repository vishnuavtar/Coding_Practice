package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacter1 {

	public static void main(String[] args) {

		String str = "This is Bangalore";

		List<String> list = new ArrayList<>();

		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.forEach((Character, count) -> System.out.println(Character + " " + count));

	}

}
