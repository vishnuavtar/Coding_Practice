package Comp4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(10, "vishnu", 100000));
		list.add(new Employee(2, "vishnu", 100000));
		list.add(new Employee(13, "vishnu", 100000));
		list.add(new Employee(11, "vishnu", 100000));
		list.add(new Employee(1, "vishnu", 100000));

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList()));
		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));
	}

}
