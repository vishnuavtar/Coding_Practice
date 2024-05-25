package Array100;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeat {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6,
				7, 8, 9, 100 };

		boolean chk;

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		Arrays.stream(aa).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).forEach(System.out::print);

		for (int i = 0; i < a.length; i++) {
			chk = false;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					chk = true;
				}
			}

			if (!chk) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
