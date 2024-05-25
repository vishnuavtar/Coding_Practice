package Array75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllArray2 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = new ArrayList<>();
		
		
		for(Integer e:aa) {
			list.add(e);
		}
		
		System.out.println(list);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
	}

}
