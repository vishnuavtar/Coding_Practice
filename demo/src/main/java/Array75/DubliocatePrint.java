package Array75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DubliocatePrint {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6,7,8,1,2,3};
		
		List<Integer> list = new ArrayList<>();
		
		for(Integer e:a) {
			list.add(e);
		}
		
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>();
		
		list.stream().filter(i->!set.add(i)).forEach(System.out::print);
	}

}
