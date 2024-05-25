package Comparato5;

import java.util.Comparator;

public class SortByEmail implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmail().compareToIgnoreCase(o2.getEmail());
	}

}
