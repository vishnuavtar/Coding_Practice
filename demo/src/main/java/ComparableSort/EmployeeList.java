package ComparableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(3,"Vishnu Avtar","vishnuavtar@gmail.com"));
		list.add(new  Employee(1,"Vishnu","vishnu@gmail.com"));
		list.add(new Employee(2,"Avtar","Avtar@gmail.com"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("After sort");
		
		System.out.println(list);
	}

}
