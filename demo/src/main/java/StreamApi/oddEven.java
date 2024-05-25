package StreamApi;

import java.util.Arrays;
import java.util.List;

public class oddEven {
	
	public static void main(String[] args) {
		
		int a[] = {1,23,4,5,6,7,8};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(aa);
		
		list.stream().filter(i->i%2==0).forEach(System.out::print);
		System.out.println("\n");
		list.stream().filter(i->i%2!=0).forEach(System.out::print);
		
		
	}
	
}
