package Array105;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingValuePrint1 {
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,12,3,3,1,2};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		Arrays.stream(aa).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry::getKey).forEach(System.out::print);
	}

}
