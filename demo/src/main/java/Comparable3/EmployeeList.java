package Comparable3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(10,"vishnu"));
		list.add(new Employee(12,"vishnuavtar"));
		list.add(new Employee(131,"Vishnu"));
		list.add(new Employee(1,"VishnuAvtar"));
		list.add(new Employee(2,"Avtar"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
	}

}
