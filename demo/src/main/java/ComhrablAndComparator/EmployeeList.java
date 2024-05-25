package ComhrablAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Array23.compare;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		
		list.add(new Employee(4,"Patna","patna@gmail.com"));
		list.add(new Employee(5,"Laptop","Laptop@gmail.com"));
		list.add(new Employee(1,"Mohan","mohan@gmail.com"));
		list.add(new Employee(2,"Sohan","sohan@gmail.com"));
		list.add(new Employee(3,"Tohan","tohan@gmail.com"));
		
		
		
		System.out.println(list);
		
		Collections.sort(list,new SortById());
		System.out.println(list);
		
		Collections.sort(list,new SortByname());
		System.out.println(list);
		
		Collections.sort(list, new SortByEmail());
		System.out.println(list);
	}

}
