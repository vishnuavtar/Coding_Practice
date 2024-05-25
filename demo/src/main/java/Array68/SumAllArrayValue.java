package Array68;

import java.util.Arrays;
import java.util.List;

public class SumAllArrayValue {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5};
		
		List<Integer> list = Arrays.asList(a);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
	}

}
