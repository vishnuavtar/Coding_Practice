package COmparator123;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comp.Employee;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Vishnu"));
		list.add(new Employee(2, "Avtar"));
		list.add(new Employee(3, "Laptop"));
		list.add(new Employee(4, "Pc"));
		list.add(new Employee(5, "Book"));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,new SortByName());    
		
	}

}
