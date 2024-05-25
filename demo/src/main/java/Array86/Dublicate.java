package Array86;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Dublicate {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 99, 1, 2, 3, 4 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> list = Arrays.asList(aa);

		HashSet<Integer> set = new HashSet<>();

		list.stream().filter(i -> !set.add(i)).forEach(System.out::print);
		
		
		int aaa[] = list.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(aaa));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
