package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee(3, "Ram3"));
		list.add(new Employee(5, "Ram4"));
		list.add(new Employee(6, "Ram5"));
		list.add(new Employee(1, "Ram"));
		list.add(new Employee(2, "Ram2"));
		
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}
