package Array20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ReverseList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
		
		
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		
		
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>(set);
		System.out.println(ls);
		
		
		TreeSet<Integer> tree = new TreeSet<Integer>(ls);
		System.out.println(tree);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		System.out.println(ll);
		
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
		
	}

}
