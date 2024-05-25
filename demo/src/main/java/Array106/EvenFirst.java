package Array106;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFirst {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 4, 5 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> even = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());

		List<Integer> odd = Arrays.stream(aa).filter(i -> i %2 != 0).collect(Collectors.toList());

		even.addAll(odd);

		System.out.println(even);
	}

}
