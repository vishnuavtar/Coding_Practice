package Comparator24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "vishnu", "vishnu@gmail.com"));
		list.add(new Employee(10, "avtar", "avtar@gmail.com"));
		list.add(new Employee(9, "avtar", "avtar@gmail.com"));

		System.out.println(list);

//		Collections.sort(list, new SortById());
//
//		System.out.println(list);
//
//		Collections.sort(list, new SortByName());
//
//		System.out.println(list);
//		
//		Collections.sort(list, new SortByEmail());
//
//		System.out.println(list);
//		

		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));

		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList()));

		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getEmail)).collect(Collectors.toList()));
		

	}

}
