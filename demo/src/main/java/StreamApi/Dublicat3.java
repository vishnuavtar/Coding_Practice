package StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Dublicat3 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(aa);
		
		HashSet<Integer> set = new HashSet<>();
		
		list.stream().filter(i->!set.add(i)).forEach(System.out::print);
	}

}
