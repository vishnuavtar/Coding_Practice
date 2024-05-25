package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayRepeat {

	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> list = Arrays.asList(a);
		
		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}
}
