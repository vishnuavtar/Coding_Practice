package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap2 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("eferf","weffew","ewfef","erfef","referf","refeefce");
		
		list.stream().flatMap(i->Stream.of(i.charAt(i.charAt(3)))).forEach(System.out::println);
		
		list.stream().flatMap(i->Stream.of(i.charAt(i.replaceAll("e", "f")))).forEach(System.out::println);
		

		
		
	}

}
