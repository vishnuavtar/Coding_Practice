package StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount26 {

	public static void main(String[] args) {

		String str = "This is Hyderabad";

		System.out.println(Arrays.stream(str.split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

	}

}
