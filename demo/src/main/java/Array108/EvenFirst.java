package Array108;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFirst {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List even = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());

		List odd = Arrays.stream(aa).filter(i -> i % 2 != 0).collect(Collectors.toList());

		even.addAll(odd);

		System.out.println(even);
	}

}
