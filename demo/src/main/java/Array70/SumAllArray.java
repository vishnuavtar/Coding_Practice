package Array70;

import java.util.Arrays;
import java.util.List;

public class SumAllArray {

	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6,7,8,1,1,2,3,4};

		List<Integer> list = Arrays.asList(a);
		
		int n = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(n);
		
		
	}
}
