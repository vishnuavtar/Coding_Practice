package Comparator8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Vishnu", "vishnu@gmail.com"));
		list.add(new Employee(10, "avtar", "avtar@gmail.com"));
		list.add(new Employee(5, "vishnuavtar", "vishnuavtar@gmail.com"));

		System.out.println(list);

		Collections.sort(list, new SortById());

		System.out.println(list);

		Collections.sort(list, new SortByName());

		System.out.println(list);
	}

}
