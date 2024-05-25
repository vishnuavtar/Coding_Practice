package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet3 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println(set);
		
		
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(30);
		ls.add(40);
		ls.add(10);
		ls.add(20);
		ls.add(50);
		System.out.println(ls);
		
		TreeSet<Integer> tree = new TreeSet<Integer>(set);
		System.out.println(tree);
		
		
		
		if(set.contains(50)) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
		Iterator<Integer> t = set.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
	}

}
