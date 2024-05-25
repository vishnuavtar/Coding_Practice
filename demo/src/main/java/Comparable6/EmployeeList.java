package Comparable6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(4,"Vishnu","Vishnu@gmail.com"));
		list.add(new Employee(5,"Avtar","Avtar@gmail.com"));
		list.add(new Employee(1,"vishnu","vishnu@gmail.com"));
		list.add(new Employee(2,"avtar","avtar@gmail.com"));
		list.add(new Employee(3,"vishnuavtar","vishnuavtar@gmail.com"));
		
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
