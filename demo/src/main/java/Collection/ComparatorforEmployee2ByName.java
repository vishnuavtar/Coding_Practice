package Collection;

import java.util.Comparator;

public class ComparatorforEmployee2ByName implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
