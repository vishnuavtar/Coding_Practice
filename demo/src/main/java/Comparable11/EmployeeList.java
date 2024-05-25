package Comparable11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(11, "vishnu", "vishnu@gmail.com"));
		list.add(new Employee(2, "avtar", "avtar@gmail.com"));

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		int a[] = list2.stream().mapToInt(Integer::new).toArray();
		System.out.println(Arrays.toString(a));
		System.out.println(list2);
		Collections.reverse(list2);

		System.out.println(list2);
		
		
		
		

	}

}
