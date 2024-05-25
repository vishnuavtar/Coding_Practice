package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet2 {
	
	
	public static void main(String[] args) {
	
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(1);
		set.add(100);
		
		System.out.println(set);
		
		TreeSet tree = new TreeSet<>(set);
		System.out.println(tree);
		
		LinkedHashSet li = new LinkedHashSet<>(set);
		System.out.println(li);
		
		Iterator r = set.iterator();
		
		while(r.hasNext()) {
			System.out.print(r.next());
		}

	}
	
}
