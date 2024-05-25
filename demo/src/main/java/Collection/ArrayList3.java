package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class ArrayList3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(58);
		list.add(12);
		list.add(13);
		list.add(98);
		list.add(1);
		list.add(58);
		list.add(12);
		list.add(13);
		list.add(98);
		System.out.println(list);
		
		ListIterator tt = list.listIterator();
		
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}
		
		Iterator t = list.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		System.out.println(list.stream().min(Integer::compare).get());
		System.out.println(list.stream().max(Integer::compare).get());
		
		
		
		System.out.println("After reverse Order");
		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
		System.out.println(list);
		System.out.println("After sort");
		Collections.sort(list);
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<Integer>(list);
		System.out.println(set);
		
		TreeSet<Integer> tree = new TreeSet<>(set);
		System.out.println(tree);
		
		
	}

}
