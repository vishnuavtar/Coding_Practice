package ComparabeAndComparator;

import java.util.ArrayList;
import java.util.Collections;

import ComhrablAndComparator.SortById;
import ComhrablAndComparator.SortByname;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list  = new ArrayList<>();
		list.add(new Employee(10,"Vishnu Avtar"));
		list.add(new Employee(30,"Sohan"));
		list.add(new Employee(40,"TOhan"));
		list.add(new Employee(50,"ROhan"));
		list.add(new Employee(20,"Mohan"));
		
		
		
		
		//System.out.println(list);
		
		Collections.sort(list,new SOrtById());
		
		System.out.println(list);
		
		Collections.sort(list, new SortByName());
		
		System.out.println(list);
		
	}

}
