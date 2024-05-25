package Array92;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnModified {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(12);
		list.add(14);
		
		System.out.println(list);
		
		List<Integer> list2 =   Collections.unmodifiableList(list);
		
		//list2.add(1000);
		
		System.out.println(list2);
	}

}
