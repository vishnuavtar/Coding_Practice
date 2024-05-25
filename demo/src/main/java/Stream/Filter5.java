package Stream;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter5 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		
		System.out.println(list.stream().filter(i->(i%2==0)).collect(Collectors.toList()));
		
		System.out.println(list.stream().filter(i->(i%2!=0)).collect(Collectors.toList()));
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		System.out.println(list.stream().min(Integer::compare).get());
		
		System.out.println(list.stream().max(Integer::compare).get());
		
		System.out.println(list.stream().map(i->i*6).collect(Collectors.toList()));
		
	// System.out.println(list.stream().flatMap((Function<? super Integer, ? extends Stream<? extends R>>) Stream.of(1)).Collect(Collectors.toList()));
	}

}
