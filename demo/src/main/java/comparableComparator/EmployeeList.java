package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		
		list.add(new Employee(1, "C"));
		list.add(new Employee(2, "D"));
		list.add(new Employee(9, "E"));
		list.add(new Employee(7, "A"));
		list.add(new Employee(3, "B"));
		

		Collections.sort(list, new ComparatorSortById());
		System.out.println(list);
		
		Collections.sort(list,new ComparatorSortByName());
		
		System.out.println(list);

	}

}
