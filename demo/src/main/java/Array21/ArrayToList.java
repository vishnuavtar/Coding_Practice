package Array21;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String a[] = {"A","B","ABC","ABCD"};
		
		
		List list = Arrays.asList(a);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		ListIterator<String> li = list.listIterator();
		System.out.println(li);
		
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		
	}

}
