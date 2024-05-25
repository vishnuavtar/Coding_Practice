package Array74;

import java.util.Arrays;
import java.util.List;

public class SumOfAllArray {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5 };

		List<Integer> list = Arrays.asList(a);

		Integer ai = list.stream().mapToInt(Integer::intValue).sum();

		System.out.println(ai);
	}

}
