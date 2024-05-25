package Comparable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(3, "Laptop", "Laptop@gmail.com"));
		list.add(new Employee(2, "Aaptop", "Laptop@gmail.com"));
		list.add(new Employee(5, "Faptop", "Laptop@gmail.com"));
		list.add(new Employee(4, "Taptop", "Laptop@gmail.com"));
		list.add(new Employee(1, "Baptop", "Laptop@gmail.com"));

		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
