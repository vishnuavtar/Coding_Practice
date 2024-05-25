package Com10;

import java.util.ArrayList;
import java.util.List;


public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"vishnu"));
		list.add(new Employee(2,"avtar"));
		list.add(new Employee(3,"vishnuavtar"));
		
		System.out.println(list.stream().sorted((emp1,emp2)->emp1.getId()-emp2.getId()).findFirst().map(Employee::getName).get());
	}

}
