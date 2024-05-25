package Stream;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter3 {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,7,8,9,2,5,3,8,6,4,3,1);
		
		List<String> list2 = List.of("abc","ndc","kld","ewq","loe");
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		System.out.println(list.stream().filter(i->i>8).collect(Collectors.toList()));
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());

		// map
		
		list.stream().map(i->i*10).forEach(System.out::print);
		
		// flatMap
		
		try {
		
		System.out.println(list2.stream().flatMap(i->Stream.of(i.charAt(2))).collect(Collectors.toList()));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		list2.stream().map(String::toUpperCase).forEach(System.out::print);
		System.out.println(list2.stream().map(String::toUpperCase).collect(Collectors.toList()));
		list2.stream().flatMap(i->Stream.of(i.replaceAll("a", "w"))).collect(Collectors.toList());
	}

}
