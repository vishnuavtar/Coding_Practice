package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter31 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,31,41,151,16,7,8,9);
		List<String> list2 = Arrays.asList("bbb","aaa","ccc","ddd","eee");
		
		System.out.print("By Filter = " + list.stream().filter(i-> i>5).collect(Collectors.toList()));
		
		list.stream().map(i->i*10).forEach(System.out::print);
		System.out.println(list.stream().map(i->i*10).collect(Collectors.toList()));
		System.out.println(list2.stream().flatMap(i->Stream.of(i.charAt(2))).collect(Collectors.toList()));
		
		// Stream  sort
		System.out.println("By stream ");
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println(list2.stream().sorted().collect(Collectors.toList()));
		
		// Normal
		
		System.out.println("By Normal");
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list2,Collections.reverseOrder());
		System.out.println(list2);
		
		System.out.println(list.stream().max(Integer::compare).get());
		
		System.out.println(list.stream().min(Integer::compare).get());
		
		list2.stream().map(String::toUpperCase).forEach(System.out::print);
		list2.stream().map(String::toLowerCase).forEach(System.out::print);
		
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
		
		
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
		
		
		
	}

}
