package Array90;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenFirst {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> even = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = Arrays.stream(aa).filter(i -> i % 2 != 0).collect(Collectors.toList());

		even.addAll(odd);

		System.out.println(even);

		int[] ai = even.stream().mapToInt(Integer::new).toArray();
		int[] bi = odd.stream().mapToInt(Integer::new).toArray();

		Integer[] aii = Arrays.stream(ai).boxed().toArray(Integer[]::new);
		Integer[] bii = Arrays.stream(bi).boxed().toArray(Integer[]::new);

		Integer[] a2 = Stream.concat(Arrays.stream(aii), Arrays.stream(bii)).toArray(Integer[]::new);

		System.out.println(Arrays.toString(a2));

		int a3[] = Arrays.stream(a2).mapToInt(Integer::new).toArray();

		System.out.println(Arrays.toString(a3));

	}

}
