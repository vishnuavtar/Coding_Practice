package Array109;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LIstUnModified {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(1000);
		list.add(5);
		list.add(2);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		List<Integer> list2 = Collections.unmodifiableList(list);
		
		System.out.println(list2);
		
		Collections.reverse(list);
		
		System.out.println(list);
	
	}

}
