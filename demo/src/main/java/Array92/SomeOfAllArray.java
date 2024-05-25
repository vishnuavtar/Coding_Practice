package Array92;

import java.util.Arrays;

public class SomeOfAllArray {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4 };

		System.out.println(Arrays.stream(a).mapToLong(Integer::new).sum());
	}
}
