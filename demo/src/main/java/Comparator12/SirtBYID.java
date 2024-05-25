package Comparator12;

import java.util.Comparator;

import Comparable12.Employee;

public class SirtBYID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getId()-o2.getId();
	}
	
	

}
