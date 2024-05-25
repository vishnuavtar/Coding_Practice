package Array83;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnModifiesList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(21);
		list.add(43);
		list.add(53);
		
		System.out.println(list);
		
		List<Integer> list2=  Collections.unmodifiableList(list);
		
		System.out.println(list2);
		
		
		
		
		
		
	}

}
