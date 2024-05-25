package Comparator11;

import java.util.Comparator;

public class SortByEmail implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmail().compareToIgnoreCase(o2.getEmail());
	}

}
