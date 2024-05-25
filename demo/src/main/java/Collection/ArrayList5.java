package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList5 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(21);
		list.add(45);
		list.add(20);
		list.add(89);
		list.add(2);
		list.add(10);
		list.add(21);
		list.add(45);
		list.add(20);
		list.add(89);
		list.add(2);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		if(list.contains(20)) {
			System.out.println("20 is present in the list");
		}else {
			System.out.println("20 is not present in the list");
		}
		
		System.out.println("After remove index 2");
		System.out.println(list.remove(2));
		
		System.out.println(list);
		
		if(list.isEmpty()) {
			System.out.println("list is empty");
		}else {
			System.out.println("list is not empty");
		}
		
		System.out.println("By ListIterator");
		
		ListIterator t = list.listIterator();
		
		while(t.hasNext()) {
			System.out.print(t.next() + " ");
		}
		
		System.out.println("By iterator");
		java.util.Iterator tt = list.iterator();
		
		while(tt.hasNext()) {
			System.out.print(tt.next() + " ");
		}
		
		System.out.println("applying stream api");
		
		System.out.println("Printing even number by stream  filter");
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
		System.out.println("Printing odd number by stream filter");
		System.out.println(list.stream().filter(i->i%2!=0).collect(Collectors.toList()));
		
		System.out.println("Printing maximum value from list by stream");
		
		System.out.println(list.stream().max(Integer::compare).get());
		
		System.out.println("Printing minu=imum value from list by stream");
		
		System.out.println(list.stream().min(Integer::compare).get());
		
		System.out.println("applying map method of stream");
		
		System.out.println(list.stream().map(i->i*10).collect(Collectors.toList()));   
	}

}
