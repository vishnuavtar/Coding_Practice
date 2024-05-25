package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map123 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Mohan");
		list.add("Sohan");
		list.add("Rohan");
		list.add("Tohan");
		
		System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
		
		System.out.println(list.stream().map(String::toLowerCase).collect(Collectors.toList()));
		
		
		System.out.println(list.stream().flatMap(i->Stream.of(i.charAt(2))).collect(Collectors.toList()));
		
		
	}

}
