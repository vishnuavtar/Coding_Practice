package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayList1 {
	
	public static void main (String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(45);
		list.add(12);
		list.add(89);
		list.add(12);
		list.add(21);
		list.add(9);
		
		System.out.println(list);
		
		System.out.println("By for each or enhanced loop");
		
		for(int x : list) {
			System.out.println(x);
		}

		System.out.println("By list Iterator");
		ListIterator<Integer> ls = list.listIterator();
		
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
		
		System.out.println("By Iterator");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Max value in list ");
		System.out.println(list.stream().max(Integer::compare).get());
		
		System.out.println("Min value in list");
		System.out.println(list.stream().min(Integer::compare).get());
		
		System.out.println(" By Filter");
		
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		
		
		list.stream().filter(i->i%2!=0).forEach(System.out::print);
		
		System.out.println("By Stream map");
		System.out.println(list.stream().map(i->i*2).collect(Collectors.toList()));
		
		
		System.out.println("By HashSet");
		
		
		HashSet<Integer> set = new HashSet<Integer>(list);
		
		System.out.println(list);
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		System.out.println(tree);
	}

}
