package Array81;

import java.util.Arrays;
import java.util.List;

public class UnModifiedlist {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9); // unmodified
		
		System.out.println(list);
		//list.add(20);
//		
		//System.out.println(list);
		
		List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9);
		
		System.out.println(list);
		
		list2.add(20);
		
		System.out.println(list2);
		
	}

}
