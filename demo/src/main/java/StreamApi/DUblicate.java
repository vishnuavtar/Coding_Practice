package StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DUblicate {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,1,2};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list  = Arrays.asList(aa);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		list.stream().filter(i->!set.add(i)).forEach(System.out::print);
	}

}
