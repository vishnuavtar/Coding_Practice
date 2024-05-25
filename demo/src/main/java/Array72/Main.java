package Array72;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 3 };
		List<Integer> duplicates = Arrays.stream(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("Duplicate values: " + duplicates);
	}
}
