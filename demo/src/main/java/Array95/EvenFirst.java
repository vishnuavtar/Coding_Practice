package Array95;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenFirst {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 45, 5, 6 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> even = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());

		List<Integer> odd = Arrays.stream(aa).filter(i -> i % 2 != 0).collect(Collectors.toList());

		even.addAll(odd);

		System.out.println(even);

		even.stream().mapToInt(Integer::new).forEach(System.out::print);

		int ai[] = even.stream().mapToInt(Integer::new).toArray();
		int bi[] = odd.stream().mapToInt(Integer::new).toArray();

		Integer aii[] = Arrays.stream(ai).boxed().toArray(Integer[]::new);
		Integer bii[] = Arrays.stream(bi).boxed().toArray(Integer[]::new);

		Integer aaa[] = Stream.concat(Arrays.stream(aii), Arrays.stream(bii)).toArray(Integer[]::new);

		System.out.println(Arrays.toString(aaa));

		int aai[] = Arrays.stream(aaa).mapToInt(Integer::new).toArray();

		System.out.println(Arrays.toString(aai));
	}

}
