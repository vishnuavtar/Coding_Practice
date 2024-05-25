package StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayCharacter {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,91,1,2,311,12,22,1,3,14,16};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		Map<Integer,Long> map= Arrays.stream(aa).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
		List<Integer> list = Arrays.asList(aa);
		
		HashSet<Integer> set = new HashSet<>();
		
		list.stream().filter(i->set.add(i)).forEach(System.out::print);
		
		List<String> ll =   list.stream().map(i->i  + " ").filter(i->i.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(ll);
		
	}

}
