package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class List1 {
	
	 public static void main(String[] args) {
		
		 
		 List<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.add(50);
		 list.add(60);
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.add(50);
		 
		 System.out.println(list);
		 
		 System.out.println("By ForEach Loop :- ");
		 for(int x:list){
			System.out.println(x); 
		 }
		 
		 System.out.println("By List Iterator :-");
		 ListIterator tt = list.listIterator();
		 while(tt.hasNext()) {
			 System.out.println(tt.next());
		 }
		 
		 
		 Iterator t = list.iterator();
		 System.out.println("By Iterator : - ");
		 while(t.hasNext()) {
			 System.out.println(t.next());
		 }
		 
		 
		 // max number from list
		 
		 System.out.println( "Maximum Number = " + list.stream().max(Integer::compare).get());
		 
		 // min number
		 
		 System.out.println("Minimum Number  = " + list.stream().min(Integer::compare).get());
		 
		 
		 
		 // Converting list to Set
		 
		 HashSet<Integer> set = new HashSet<>(list);
		 System.out.println(set);
		 
		 LinkedHashSet<Integer> ll = new LinkedHashSet<>(set);
		 System.out.println(ll);
		 
		 TreeSet<Integer> tree = new TreeSet<>(ll);
		 System.out.println(tree);
		 
		 //  Set Iterator
		 
		 Iterator st = tree.iterator();
		 while(st.hasNext()) {
			 System.out.println(st.next());
		 }
		 
		 System.out.println(tree.stream().count());	
		 System.out.println(tree.stream().max(Integer::compare).get());
		 System.out.println(tree.stream().min(Integer::compare).get());
		
		 
	}

}
