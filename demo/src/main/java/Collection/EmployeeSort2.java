package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort2 {
	
	public static void main(String[] args) {
		
		
ArrayList<Employee2> list = new ArrayList<>();
		
		list.add(new Employee2(3, "Ram3"));
		list.add(new Employee2(5, "Ram4"));
		list.add(new Employee2(6, "Ram5"));
		list.add(new Employee2(1, "Ram"));
		list.add(new Employee2(2, "Ram2"));
		
		
		System.out.println(list);
		
		//Collections.sort(list, new IdComparatorForEmploye2());
		Collections.sort(list, new ComparatorforEmployee2ByName());
		
		System.out.println(list);
	}

}
