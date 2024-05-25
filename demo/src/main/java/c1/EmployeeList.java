package c1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Vishnu"));
		list.add(new Employee(2,"Avtar"));
		list.add(new Employee(3,"Laptop"));
		
		System.out.println(list);
		
		Collections.sort(list,new ByNameSort());
		
		System.out.println(list);
	}

}
