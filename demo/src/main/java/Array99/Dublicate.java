package Array99;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dublicate {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,100,1,2,3,4,5,6,7,7,7};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
//		
//		HashSet<Integer> set = new HashSet<>();
//		
//		Arrays.stream(aa).filter(i->!set.add(i)).forEach(System.out::print);
		
		Arrays.stream(aa).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() > 1)
		.map(Map.Entry::getKey).forEach(System.out::println);

	}

}
