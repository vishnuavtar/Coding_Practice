package Comparable5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Vishnu","vishnu@gmail.com"));
		list.add(new Employee(10,"avtar","avtar@gmail.com"));
		list.add(new Employee(5,"vishnuavtar","vishnuavtar@gmail.com"));
		list.add(new Employee(5,"vishnuavtar","vishnuavtar@gmail.com"));

		
		System.out.println(list);
		
		Collections.sort(list);
		
		
		System.out.println(list);
		
		 Map<String, Long> map = 	list.stream().collect(Collectors.groupingBy(Employee::getEmail, Collectors.counting()));

		 System.out.println(map);
		 
		Map<String, Double> map2 =  list.stream().collect(Collectors.groupingBy(Employee::getEmail, Collectors.averagingInt(Employee::getId)));
	
	
		System.out.println(map2);
	}

}
