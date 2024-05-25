package Com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(51,"vishnu","vishnuavtar"));
		list.add(new Employee(10,"vishnu","vishnuavtar"));
		list.add(new Employee(12,"vishnu","vishnuavtar"));
		list.add(new Employee(100,"vishnu","vishnuavtar"));
		list.add(new Employee(16,"vishnu","vishnuavtar"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
	}
}
