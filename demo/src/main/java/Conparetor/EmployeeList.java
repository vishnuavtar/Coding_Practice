package Conparetor;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(3, "Bike", "AF"));
		list.add(new Employee(1, "Car", "US"));
		list.add(new Employee(2, "Flight", "India"));
		
		System.out.println(list);
		
		Collections.sort(list, new SortById());
		System.out.println(list);
		
		Collections.sort(list, new SOrtByName());
		System.out.println(list);
		
	}
}
