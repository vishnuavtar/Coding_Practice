package Comparator13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(3,"zohan","rohan@gmail.com"));
		list.add(new Employee(3,"Mohan","mohan@gmail.com"));
		list.add(new Employee(2,"Aohan","Aohan@gmail.com"));
		
		System.out.println(list);
		
		Collections.sort(list, new SortById());
		
		System.out.println(list);
		
		System.out.println("By Name");
		
		Collections.sort(list, new SorByName());
		
		System.out.println(list);
		
		System.out.println("Sort by name");
		
		Collections.sort(list,new SortByEmail());
		
		System.out.println(list);
	}

}
