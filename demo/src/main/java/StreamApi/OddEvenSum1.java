package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenSum1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 89, 10, 1, 2, 3, 4, 5, 5, 7, 8,10 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		int even = Arrays.stream(aa).filter(i -> i % 2 == 0).mapToInt(Integer::new).sum();

		int odd = Arrays.stream(aa).filter(i -> i % 2 != 0).mapToInt(Integer::new).sum();
//
//		Arrays.stream(even).mapToInt(Integer::new).sum();

		System.out.println(even);

		System.out.println(odd);

	}

}
