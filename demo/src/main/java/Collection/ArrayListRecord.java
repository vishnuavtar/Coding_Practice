package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayListRecord {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(5);
		
		System.out.println(list);
		
		System.out.println(list.stream().min(Integer::compare).get());
		System.out.println(list.stream().max(Integer::compare).get());
		
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println(list.stream().filter(i->i%2!=0).collect(Collectors.toList()));

		ListIterator<Integer> tt = list.listIterator();
		
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}
		
		Iterator t = list.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		
		HashSet<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
		
		System.out.println(set.stream().filter(i->i%2==0).collect(Collectors.toList()));
		
		TreeSet<Integer> tree = new TreeSet<>(set);
		System.out.println(tree);
		
		System.out.println(tree.stream().map(i->i*10-1).collect(Collectors.toList()));
		
		
		
		
	}

}
