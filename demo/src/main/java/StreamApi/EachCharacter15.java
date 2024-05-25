package StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacter15 {

	public static void main(String[] args) {

		String str = "This is Bangalore";

		String str2 = str.toLowerCase();

		Map<Character, Long> map = str2.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}

}
