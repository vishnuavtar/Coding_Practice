package Array91;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenFirst {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> list = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(aa).filter(i -> i % 2 != 0).collect(Collectors.toList());

		list.addAll(list2);

		//System.out.println(list);

		int[] ai = list.stream().mapToInt(Integer::new).toArray();
		int bi[] = list2.stream().mapToInt(Integer::new).toArray();

		Integer aii[] = Arrays.stream(ai).boxed().toArray(Integer[]::new);
		Integer bii[] = Arrays.stream(bi).boxed().toArray(Integer[]::new);

		Integer aai[] = Stream.concat(Arrays.stream(aii), Arrays.stream(bii)).toArray(Integer[]::new);

		//System.out.println(Arrays.toString(aai));

		int bbi[] = Arrays.stream(aai).mapToInt(Integer::new).toArray();

		System.out.println(Arrays.toString(bbi));
	}

}
