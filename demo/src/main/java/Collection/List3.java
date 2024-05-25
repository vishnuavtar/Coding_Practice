package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List3 {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		ListIterator t = list.listIterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	
	}

}
