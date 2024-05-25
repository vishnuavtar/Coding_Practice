package Array71;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateFinder {
	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1, 1, 9, 6 };

		List<Integer> duplicates = Arrays.stream(array).collect(Collectors.groupingBy(i -> i)).entrySet().stream()
				.filter(entry -> entry.getValue().size() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());

		System.out.println("Duplicate values: " + duplicates);
	}
}
