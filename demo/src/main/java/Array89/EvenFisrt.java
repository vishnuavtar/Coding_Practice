package Array89;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFisrt {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> ai = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> bi = Arrays.stream(aa).filter(i -> i % 2 != 0).collect(Collectors.toList());

		ai.addAll(bi);

		System.out.println(ai);

	}

}
