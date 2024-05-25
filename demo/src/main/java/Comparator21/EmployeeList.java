package Comparator21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import COmparable121.Student;

public class EmployeeList {
	
	public static void main(String[] args) {
		
List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Vishnu","vishnu@gmail.com"));
		list.add(new Employee(3,"vishnuavtar","vishnuavtar@gmail.com"));
		list.add(new Employee(2,"Avtar","avtar@gmail.com"));
		
		System.out.println(list);
		
		System.out.println("Sort By Id    ");
		Collections.sort(list , new SortById());
		
		System.out.println(list);

		System.out.println("Sort by Name");
         Collections.sort(list , new SortByName());
		
		System.out.println(list);

		
	}

}
