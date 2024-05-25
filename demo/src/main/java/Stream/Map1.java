package Stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,8,9,4,7,1,234,5);
		
		System.out.println(list.stream().map(i->i*10).collect(Collectors.toList()));
		
		System.out.println(list.stream().flatMap(i->Stream.of(i%2==0)).collect(Collectors.toList()));
	}

}
