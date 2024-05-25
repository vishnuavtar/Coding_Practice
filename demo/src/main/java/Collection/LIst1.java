package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class LIst1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,100,35,111,200);
		
		// iterate
		Iterator t = list.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		ListIterator tt = list.listIterator();
		
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println("After reverse -- ");
		Collections.reverse(list2);
		System.out.println("After reverse " + list2);
		
		System.out.println(list.get(4));
	}

	
}



