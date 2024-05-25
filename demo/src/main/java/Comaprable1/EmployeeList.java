package Comaprable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(4,"Vishnu","vishnu@gmail.com"));
		list.add(new Employee(5,"Avtar","vishnu@gmail.com"));
		list.add(new Employee(5,"VishnuAvtar","vishnu@gmail.com"));
		list.add(new Employee(1,"vishnu","vishnu@gmail.com"));
		list.add(new Employee(2,"avtar","vishnu@gmail.com"));
		list.add(new Employee(3,"vishnuavtar","vishnu@gmail.com"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
