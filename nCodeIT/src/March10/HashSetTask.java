package March10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetTask {
	
	public static void main(String[] args) {
		
		HashSet<String> set  = new HashSet<>();
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		
		
		// Set Iterator
		
		Iterator<String> p  =set.iterator();
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
				
		
		System.out.println("Original Value " + set);
		
//		if(set.isEmpty()) {
//			System.out.println("Set is empty");
//		}else {
//			System.out.println("set is not empty ");
//		}
//		
//		set.removeAll(set);
//		
//		if(set.isEmpty()) {
//			System.out.println("Set is empty");
//		}
		
		
		// Creating new Array
		
		String[] new_array = new String[set.size()];
		set.toArray(new_array);
		
		
		System.out.println("Array Elemets");
		for(String element : new_array) {
			System.out.println(element);
		}
		
		// Create a list from hashset element
		
		List<String> list = new ArrayList<String>(set);
		
		System.out.println("By ArrayList = "
				+ "" + list);
//				
		
		
		System.out.println("First hashset content = " + set);
		
		HashSet<String> set2 = new HashSet<>();
		set2.add("Red");
		set.add("Pink");
		set.add("Black");
		set.add("Orange");
		System.out.println("Second set = " + set2);
		
		set.retainAll(set2);
		System.out.println(set);
		
		System.out.println("First hashset content = " + set);
		
		
	}

}
