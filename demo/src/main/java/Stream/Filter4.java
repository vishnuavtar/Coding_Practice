package Stream;


import java.util.List;
import java.util.stream.Collectors;

public class Filter4 {

	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,8,9,4,7,1,234,5);
		
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		
		list.stream().filter(i->i%2==1).forEach(System.out::print);
		System.out.println("\n");
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
	}
}
