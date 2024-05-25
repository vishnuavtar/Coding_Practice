package MaxMinREpeatedValueInArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringMostRepeated {

	public static void main(String[] args) {

		List<String> yourList = Arrays.asList("vishnu", "vishnu", "avtar", "vishnuavtae");

		String mostRepeated = yourList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElse(null);

		System.out.println(mostRepeated);
	}

}
