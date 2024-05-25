package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList8 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println(list);

		list.stream().filter(i -> i % 2 == 0).forEach(System.out::print);
		list.stream().filter(i -> i % 2 != 0).forEach(System.out::print);

		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());

		if (list.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.print("Not Empty -> ");
			System.out.println(list);
		}

		Iterator t = list.iterator();

		while (t.hasNext()) {
			System.out.println(t.next());
		}

		ListIterator tt = list.listIterator();

		while (tt.hasNext()) {
			System.out.println(tt.next());
		}

		System.out.println(list.get(3));

		HashSet<Integer> set = new HashSet<>();

		set.addAll(list);
		
		System.out.println(set);
		

	}

}
