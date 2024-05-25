package Comparator3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Comparable3.Employee;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(10,"vishnu"));
		list.add(new Employee(12,"vishnuavtar"));
		list.add(new Employee(131,"Vishnu"));
		list.add(new Employee(1,"aVishnuAvtar"));
		list.add(new Employee(2,"Avtar"));
		
	
		System.out.println(list);
		
		Collections.sort(list,sortById());

	}

	
}
