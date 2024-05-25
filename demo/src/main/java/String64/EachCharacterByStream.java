package String64;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacterByStream {

	 public static void main(String[] args) {
	        String inputString = "This is Bangalore";

	        Map<Character, Long> characterCountMap = inputString.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        characterCountMap.forEach((character, count) -> System.out.println(character + ": " + count));
	    }
}
