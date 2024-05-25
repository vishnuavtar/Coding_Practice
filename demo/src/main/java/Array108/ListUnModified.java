package Array108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUnModified {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		
		List<Integer> list2 = Collections.unmodifiableList(list);
		
		list2.add(100);
		
		System.out.println(list2);
		
	}

}
