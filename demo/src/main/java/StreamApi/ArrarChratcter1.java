package StreamApi;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrarChratcter1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,0,1,2,34};
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.stream(aa).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}

}
