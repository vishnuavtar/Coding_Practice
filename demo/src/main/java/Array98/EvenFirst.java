package Array98;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenFirst {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 56, 7, 8, 9, 9, 1, 2, 3, 4 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> list = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(aa).filter(i -> i % 2 != 0).collect(Collectors.toList());

		list.addAll(list2);

		System.out.println(list);

		int aai[] = list.stream().mapToInt(Integer::new).toArray();
		int bbi[] = list2.stream().mapToInt(Integer::new).toArray();

		Integer aaa[] = Arrays.stream(aai).boxed().toArray(Integer[]::new);
		Integer bbb[] = Arrays.stream(bbi).boxed().toArray(Integer[]::new);

		Integer aab[] = Stream.concat(Arrays.stream(aaa), Arrays.stream(bbb)).toArray(Integer[]::new);

		int ab[] = Arrays.stream(aab).mapToInt(Integer::new).toArray();

		System.out.println(Arrays.toString(ab));
	}

}
