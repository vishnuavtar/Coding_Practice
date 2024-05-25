package Array103;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SingleValue {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8, 9, 11, 2, 3, 4, 6, 7, 10, 8, 9, 0 };

		HashSet<Integer> set = new HashSet<>();

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		System.out.println(Arrays.stream(aa).filter(i -> set.add(i)).collect(Collectors.toList()));

		boolean chk;

		for (int i = 0; i < a.length; i++) {
			chk = false;
			for (int j = i + 1; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					chk = true;
				}
			}

			if (!chk) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
