package Comparable16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "vishnu", "vishnu@gmail.com"));
		list.add(new Employee(10, "avtar", "avtar@gmail.com"));
		list.add(new Employee(9, "avtar", "avtar@gmail.com"));

		System.out.println(list);

		Collections.sort(list);

		System.out.print(list);

	}

}
