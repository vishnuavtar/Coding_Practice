package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayLIstString1 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("laptop");
		list.add("pc");
		list.add("book");
		list.add("Pen");
		list.add("home");
		list.add("apple");
		list.add("Apple");
		
		System.out.println(list);
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(list.stream().min(String::compareTo).get());
		System.out.println(list.stream().max(String::compareTo).get());

	}

}
