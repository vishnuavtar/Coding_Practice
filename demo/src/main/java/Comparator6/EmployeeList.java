package Comparator6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(3,"vishnuavtar","avtar@gmail.com"));
		list.add(new Employee(4,"Avtar","avtar@gmail.com"));
		list.add(new Employee(2,"VishnuAvtar","avtar@gmail.com"));
		list.add(new Employee(1,"vishnu","vishnu@gmail.com"));
		list.add(new Employee(2,"avtar","avtar@gmail.com"));
	
		System.out.println(list);
		
		Collections.sort(list, new SortById());
		
		System.out.println(list);
		
		Collections.sort(list, new SortByName());
		
		System.out.println(list);
	
		
	}

}
