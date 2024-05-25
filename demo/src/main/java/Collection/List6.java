package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class List6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(45);
		list.add(45);
		
		System.out.println(list);
		
		System.out.println("By list Iteraor");
		ListIterator<Integer> t  = list.listIterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		System.out.println("By Iterator");
		Iterator<Integer> tt = list.iterator();
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}
		
		
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println(list.stream().filter(i->i%2!=0).collect(Collectors.toList()));
		
		System.out.println((list.stream().max(Integer::compare).get()));
		
		System.out.println(list.stream().min(Integer::compare).get());
		
		HashSet<Integer> set = new HashSet<Integer>(list);
		
		System.out.println(set);
		
		
		
	}
}
