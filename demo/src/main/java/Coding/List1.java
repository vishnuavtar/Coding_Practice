package Coding;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		List<Integer>  list = new ArrayList<>();
	
		list.add(25);
		list.add(25);
		list.add(30);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println(list.indexOf(10));
		
		if(list.contains(10)) {
			System.out.println("Present");
		}else {
			System.out.println("No Present");
		}
	
	}
}
