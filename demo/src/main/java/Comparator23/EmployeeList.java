package Comparator23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "vishnu", 100000));
		list.add(new Employee(2, "vishnu", 200000));
		list.add(new Employee(3, "vishnu", 300000));
		list.add(new Employee(4, "vishnu", 50000));

//		System.out.println(list);
//
//		System.out.println(list.stream()
//				.collect(Collectors.groupingBy(Employee::getId, Collectors.averagingInt(Employee::getSalary))));
//		System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting())));

		System.out.println(list.stream().sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary()).findFirst()
				.map(Employee::getSalary).get());
	}
	
	
	

}
