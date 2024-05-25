package Array99;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiedList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		
		List<Integer> list2 = Collections.unmodifiableList(list);
		
		//list2.add(100);
		System.out.println(list);
	}

}
