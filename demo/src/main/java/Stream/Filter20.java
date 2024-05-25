package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter20 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(19);
		
		System.out.println(list);
		
		list.stream().filter(i->i%2==0).forEach(System.out::print);
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println(list.stream().filter(i->i%2!=0).collect(Collectors.toList()));
		System.out.println(list.stream().filter(i->i%3==0).collect(Collectors.toList()));
		
		//map
		
		System.out.println(list.stream().map(i->i*10).collect(Collectors.toList()));
		
		System.out.println(list.stream().flatMap(i->Stream.of(i%2==0)).collect(Collectors.toList()));
	}

}
