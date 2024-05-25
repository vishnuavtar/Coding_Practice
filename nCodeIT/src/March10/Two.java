package March10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Two {

	
public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Balck");
		
		System.out.println(list);
//		
//		for(String list2 : list) {
//			System.out.println(list2);
//		}
//		
//		// Removing 3rd element
//		
//		System.out.println("After remover = " + list.remove(2));
//		System.out.println("Removed successfull " + list);
//		
//		
//		// Sorting
//		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		List<String> list3 = list.subList(0, 3);
//		System.out.println("List of first three elements = " + list3);
//		
//		System.out.println("Original ArrayList" + list);
//		
//		System.out.println("AOrray List empty or not"+ list.isEmpty());
//		list.removeAll(list);
//		System.out.println("ArrayList after remove all elemets = " + list);
//		System.out.println("Arraylist EMpty or not " + list);
//		
//		// Set iterator on specify index  // It shoe exception
//		
////		Iterator p = list.listIterator(1);
////		
////		while(p.hasNext()) {
////			System.out.println(p.next());
////		}
		
		if(list.contains("Green")) {
			System.out.println("Green is present");
		}else {
			System.out.println("Green is not present");
		}
		
		if(list.contains("Orange")) {
			System.out.println("Orange is present");
		}else {
			System.out.println(" Orange is Not present");
		}
	}
}
