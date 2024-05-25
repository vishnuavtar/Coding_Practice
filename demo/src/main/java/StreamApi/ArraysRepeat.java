package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraysRepeat {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(aa);
		
		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}
}
