package Comp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10, "vishnu", 100000));
		list.add(new Employee(1, "vishnu", 100000));
		list.add(new Employee(2, "vishnu", 100000));
		list.add(new Employee(5, "vishnu", 100000));
		list.add(new Employee(13, "vishnu", 100000));
		
		Collections.sort(list);

		System.out.println(list);

		list.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::print);
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
	}

}
