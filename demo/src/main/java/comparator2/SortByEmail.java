package comparator2;

import java.util.Comparator;

public class SortByEmail implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
	
		return o1.getEmail().compareTo(o2.getEmail());
	}

}
