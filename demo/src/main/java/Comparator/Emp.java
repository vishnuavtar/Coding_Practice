package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ComhrablAndComparator.SortByEmail;

public class Emp {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(2,"Vishnu2","vishnu2@gmail.com"));
		list.add(new Employee(3,"Vishnu3","Avishnu3@gmail.com"));
		list.add(new Employee(1,"Vishnu","vishnu@gmail.com"));
		
		
		//System.out.println(list);
		
		Collections.sort(list, new SortById());
		
		System.out.println(list);
	}

}
