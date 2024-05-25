package Array76;

import java.util.Arrays;
import java.util.List;

public class SumOfAllArray {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(aa);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
		
		System.out.println(Arrays.stream(aa).mapToInt(Integer::intValue).sum());
	}

}
