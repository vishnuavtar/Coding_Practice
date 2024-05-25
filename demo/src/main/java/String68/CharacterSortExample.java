package String68;

import java.util.stream.Collectors;

public class CharacterSortExample {
	public static void main(String[] args) {
		String inputSentence = "This is a sample sentence for sorting characters using Java Stream API";

		String sortedSentence = inputSentence.chars().mapToObj(c -> (char) c).sorted().map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println(sortedSentence);
	}
}
