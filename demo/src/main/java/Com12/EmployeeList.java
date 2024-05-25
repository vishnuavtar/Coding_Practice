package Com12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(3,"vishnuavtar","vishnuavtar@gmail.com"));
		list.add(new Employee(1,"Vishnu","vishnu@gmail.com"));
		list.add(new Employee(2,"Avtar","avtar@gmail.com"));
		
		System.out.println(list);
		
		System.out.println("Sort By id");
		Collections.sort(list,new EmployeeSortById());
		System.out.println(list);
		
		
		System.out.println("Sort by name");
		
		Collections.sort(list, new EmployeeSortByName());
		System.out.println(list);
		
		System.out.println("Sort by email");
		
		Collections.sort(list, new EmployeeSortByEmail());
		System.out.println(list);
		
		
	}

}
