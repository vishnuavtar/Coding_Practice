package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public final class FlatMap {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("hvhbs","hbfb","uydhf","gweh","gef");
		System.out.println(list.stream().flatMap(s->Stream.of(s)).collect(Collectors.toList()));
		list.stream().flatMap(s->Stream.of(s.charAt(3))).forEach(System.out::println);
		list.stream().flatMap(Int
					
		
		
	}

}
