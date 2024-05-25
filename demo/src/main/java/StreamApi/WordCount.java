package StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {

		String str = "This is String";

		Map<String, Long> wordCount = Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		wordCount.forEach((word, count) -> System.out.println(word + " " + count));
	}

}
