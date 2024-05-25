package Comparable2;

import java.util.Comparator;

public class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEid()-o2.getEid();
	}

}
