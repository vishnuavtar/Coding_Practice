

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(3,"Tohan","tohan@gmail.com"));
		list.add(new Employee(1,"Mohan","Mohan@gmail.com"));
		list.add(new Employee(2,"Sohan","Sohan@gmail.com"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
