package Comparable12;

import java.util.ArrayList;
import java.util.Collections;


public class EmployeeList {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Vishnu","vishnu@gmail.com"));
		list.add(new Employee(3,"AvtarVishnu","AvtaVishnu@gmail.com"));
		list.add(new Employee(2, "AVishnu", "AVishnu@gmail.com"));
		
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
