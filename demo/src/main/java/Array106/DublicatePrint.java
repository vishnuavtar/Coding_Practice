package Array106;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicatePrint {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,1,1,4};
		
		int aa = (int) Arrays.stream(a).mapToDouble(Integer::new).sum();
		
		// System.out.println(aa);
		
		Integer[] a1 = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		Arrays.stream(a1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i->i.getValue()==1)
		.map(Map.Entry::getKey).forEach(System.out::print);
		
		
		
		
		
	}
	
	
	
}
