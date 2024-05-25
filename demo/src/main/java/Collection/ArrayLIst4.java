package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLIst4 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(11);
		list.add(20);
		list.add(30);
		
		
		System.out.println(list);
				
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println(list.stream().filter(i->i%2!=0).collect(Collectors.toList()));
		
		System.out.println(list.stream().max(Integer::compare).get());
		
		
		System.out.println(list.stream().min(Integer::compare).get());
		
		

		
	}

}
