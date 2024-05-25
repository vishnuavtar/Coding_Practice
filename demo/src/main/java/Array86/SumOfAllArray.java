package Array86;

import java.util.Arrays;

public class SumOfAllArray {

	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 99, 1, 2, 3, 4 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		System.out.println(Arrays.stream(aa).mapToInt(Integer::intValue).sum());
	}
}
