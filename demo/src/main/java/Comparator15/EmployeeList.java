package Comparator15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(10, "vishnu", "vishnu@gmail.com"));
		list.add(new Employee(11, "vishnu", "vishnu@gmail.com"));
		list.add(new Employee(1, "vishnu", "avtar@gmail.com"));

		System.out.println(list);

		Collections.sort(list, new SortById());
		System.out.println(list);

		Collections.sort(list, new SortByName());
		System.out.println(list);

		Collections.sort(list, new SortByEmail());
		System.out.println(list);

		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employee::getEmail, Collectors.counting()));

		System.out.println(map);

		Map<Integer, Double> map2 = list.stream()
				.collect(Collectors.groupingBy(Employee::getId, Collectors.averagingInt(Employee::getId)));

		System.out.println(map2);
		
		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList()));
		
		System.out.println(list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));
	}

}
