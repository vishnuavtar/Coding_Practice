package Comparator1231;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(11, "vishnu", "vishnu@gmail.com"));
		list.add(new Employee(2, "avtar", "avtar@gmail.com"));
		
		System.out.println(list);
		
		Collections.sort(list,new SortById());
		
		System.out.println(list);
		
		Collections.sort(list, new SortByName());
		
		System.out.println(list);
		

	}

}
