package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class List8 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("abc");
		list.add("mno");
		list.add("car");
		list.add("flight");
		list.add("email");

		System.out.println(list);
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		ListIterator<String> t = list.listIterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(100);
		ar.add(50);
		ar.add(30);
		ar.add(1501);
		ar.add(100);
		ar.add(50);
		ar.add(100);
		ar.add(60);
		
		System.out.println(ar);
		
		Collections.sort(ar);
		
		System.out.println(ar);
		
		System.out.println(ar.size());
		System.out.println(ar.stream().count());
		
		System.out.println(ar.stream().max(Integer::compare).get());
		System.out.println(ar.stream().min(Integer::compare).get());
		
		System.out.println(ar.stream().filter(i->i%2==0).collect(Collectors.toList()));
		
		System.out.println(ar.stream().filter(i->i%2!=0).collect(Collectors.toList()));
		
		System.out.println(ar.stream().map(i->i*5).collect(Collectors.toList()));
		
		HashSet<String> set = new HashSet<String>(list);
		
		System.out.println(set);
		
		TreeSet<String> tree = new TreeSet<String>(set);
		
		System.out.println(tree);
		
		HashSet<Integer> iset = new HashSet<Integer>(ar);
		System.out.println(iset);
		
		TreeSet<Integer> itree = new TreeSet<Integer>(ar);
		System.out.println(itree);
		
		
		
		
	}

}
