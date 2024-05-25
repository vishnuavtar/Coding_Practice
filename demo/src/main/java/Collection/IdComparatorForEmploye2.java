package Collection;

import java.util.Comparator;

public class IdComparatorForEmploye2 implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.getId()-o2.getId();
	}

}
