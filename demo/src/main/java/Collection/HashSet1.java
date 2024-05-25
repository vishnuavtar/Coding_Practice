package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(130);
		set.add(20);
		set.add(1);
		set.add(14);
		System.out.println(set);
		
		// iteration
		
		Iterator t = set.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		// Max
		
	  LinkedHashSet<Integer> lk = new LinkedHashSet<Integer>(set);
	  System.out.println(lk);
	  
	  TreeSet<Integer> tree = new TreeSet<Integer>(set);
	  System.out.println(tree);
	  //Collections.sort(tree, Collections.reverseOrder());
		ArrayList<Integer> ar = new ArrayList<Integer>(tree);
		System.out.println("In Array format " + ar);
		
		int n = ar.size();
		int max = ar.get(0);
		
		for(int i = 0; i<n; i++) {
			if(ar.get(i)>max) {
				max = ar.get(i);
			}
			
		}
		System.out.println(max);
		
		
		
	}

}
