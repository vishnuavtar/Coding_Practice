package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AMapstreamTest {
	
	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<>();
		
		
		list.add("This is a city");
		list.add("This is a laptop");
		list.add("This is camera");
		list.add("This is a home");
		list.add("This is only");
		
		
	
		System.out.println(list);
		
		
		// map
		
		System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
		
		System.out.println(list.stream().map(String::toLowerCase).collect(Collectors.toList()));
		
		
		System.out.println(list.stream().flatMap(i->Stream.of(i.charAt(8))).collect(Collectors.toList()));
		
		
		
		
	}

}
