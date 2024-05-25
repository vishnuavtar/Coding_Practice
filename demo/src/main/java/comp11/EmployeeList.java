package comp11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(10, "vishnu"));
		list.add(new Employee(9, "vishnu"));
		list.add(new Employee(1, "vishnu"));
		list.add(new Employee(2, "vishnu"));
		list.add(new Employee(4, "vishnu"));

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList()));
	
		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));

	
	}
}
