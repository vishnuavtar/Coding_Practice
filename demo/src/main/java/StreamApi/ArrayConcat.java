package StreamApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayConcat {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 77, 10, 9 };
		int b[] = { 1, 2, 3, 4, 5, 6, 77, 10, 9 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Integer bb[] = Arrays.stream(b).boxed().toArray(Integer[]::new);

		int aaa[] = Stream.concat(Arrays.stream(aa), Arrays.stream(bb)).mapToInt(Integer::new).toArray();

		System.out.println(Arrays.toString(aaa));

	}

}
