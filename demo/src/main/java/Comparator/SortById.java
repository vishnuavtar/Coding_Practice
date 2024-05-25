package Comparator;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return o1.getId()-o2.getId();
//	}
	
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return o1.getName().compareTo(o2.getName());
//	}

	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmail().compareTo(o1.getEmail());
	}
	
}
