package StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class DublicatePrint {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,41,2,3,4,5,6,7,8,9};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(aa);
		
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>();
		
		list.stream().filter(i->!set.add(i)).forEach(System.out::print);
		
		HashSet<Integer> set1 = new HashSet<>(list);
		
		System.out.println(set1);
		
		TreeSet<Integer> tree = new TreeSet<>(set1);
		
		System.out.println(tree);


		
	}

}
