package Array104;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeat {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 23, 4, 5, 6, 7, 1, 8, 100 ,119};

//		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
//				.orElseThrow(() -> new IllegalStateException("Array is Empty"));
//
//		System.out.println(aa);

		Integer aaa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		Arrays.stream(aaa).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(i -> i.getValue() >= 1).map(Map.Entry::getValue).forEach(System.out::print);
	}

}
