package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class List2 {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,6,5,4,3,2,1,9);
		System.out.println(list);

		System.out.println(list.get(10));
		
		// Oterator
		
		ListIterator<Integer> t = list.listIterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
//		if(list.contains(5>9)) {
//			System.out.println(list);
//		}
		
		System.out.println("By stream \n");
		list.stream().filter(i->i>5).forEach(System.out::println);
	List<Integer> newList = 	list.stream().filter(i->i>5).collect(Collectors.toList());
		System.out.println(newList);
		
		int n = list.size();
		int max = list.get(0);
		
		for(int i=0; i>n; i++) {
			if(list.get(i)>max) {
				max = list.get(i);
			}
			
			
		}
		System.out.println(max);
		
	}

}
