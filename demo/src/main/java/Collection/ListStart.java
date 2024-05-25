package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class ListStart {
	
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
//		
//		
//		list.add(5);
//		list.add(1);
//		list.add(2);
//		list.add(4);
//		list.add(3);
//		
//		System.out.println(list);
//		
//		System.out.println(list.get(4));
//		
//		Iterator<Integer> tt = list.iterator();
//		
//		System.out.println("Iterator");
//		
//		while(tt.hasNext()) {
//			System.out.println(tt.next());
//		}
//		
//		int a  = list.remove(3);
//		System.out.println(a);
//		
//		System.out.println(list);
//		
//List<Integer> list2 = new ArrayList<>();
//		
//		
//		list2.add(5);
//		list2.add(1);
//		list2.add(2);
//		list2.add(4);
//		list2.add(3);
//		
//		list.addAll(list2);
//		
//		System.out.println(list);
//		
//		HashSet<Integer> set = new HashSet<Integer>(list);
//		
//		System.out.println(set);
//		
//		TreeSet<Integer> tree = new TreeSet<>(set);
//		
//		System.out.println(tree);
//		
//		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>(tree);
//		
//		System.out.println(lset);
//		
		
		List<String> str = new ArrayList<>();
		str.add("Delhi");
		str.add("mumbai");
		str.add("Hyderabad");
		str.add("HitechCity");
		
		
		System.out.println(str);
		
		TreeSet<String> tree = new TreeSet<String>(str);
		System.out.println(tree);
		
		
		
		
	}

}
