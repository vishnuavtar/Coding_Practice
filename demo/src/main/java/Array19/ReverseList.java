package Array19;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		Collections.sort(list , Collections.reverseOrder());
		
		System.out.println(list);
		
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
		
		
	}

}
