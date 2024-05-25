package Stream;

import java.util.Map;
import java.util.stream.Collectors;

public class EachChar {

	public static void main(String[] args) {
		String inputString = "Hello, World!";
		Map<Character, Long> characterCount = countCharacters(inputString);
		System.out.println(characterCount);
	}

	public static Map<Character, Long> countCharacters(String inputString) {

		return inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	}
}
