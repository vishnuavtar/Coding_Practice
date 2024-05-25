package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(60);
		list.add(11);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(11);
		list.add(10);
		list.add(20);
		list.add(30);
		
		
		System.out.println(list);
		
		ListIterator<Integer> ts = list.listIterator();
		
		while(ts.hasNext()) {
			System.out.println(ts.next());
		}
		
		Iterator tt = list.listIterator();
		
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("After reverseOrder");
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
		
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());

		list.stream().filter(i->i%2==0).forEach(System.out::println);
		list.stream().filter(i->i%2!=0).forEach(System.out::println);

		
		list.stream().map(i->i*10).forEach(System.out::print);
		
		System.out.println("By HashSet");
		
		HashSet<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		
		if(set.containsAll(list)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//if(set.containsAll(set))
		
		if(set.containsAll(list)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
