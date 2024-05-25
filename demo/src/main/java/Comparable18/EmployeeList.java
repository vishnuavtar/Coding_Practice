package Comparable18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(10, "vishnu", 1000));
		list.add(new Employee(1, "vishnu", 1000));
		list.add(new Employee(20, "vishnu", 1000));

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

//		list.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::print);
//		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
//
//		list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::print);
//
//		Map<Integer, Double> map = list.stream()
//				.collect(Collectors.groupingBy(Employee::getId, Collectors.averagingDouble(Employee::getSalary)));
//
//		System.out.println(map);

	}

}
