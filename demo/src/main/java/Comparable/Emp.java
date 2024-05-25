package Comparable;

import java.util.ArrayList;
import java.util.List;

import ComhrablAndComparator.Employee;

public class Emp {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Vishnu", "Vishnu2gmail.com"));
		list.add(new Employee(2, "Vishnu2", "Vishnu22gmail.com"));
		list.add(new Employee(3, "Vishnu3", "Vishnu23gmail.com"));
		
		
		System.out.println(list);
	}

}
