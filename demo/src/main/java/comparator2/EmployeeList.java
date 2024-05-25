package comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		List<Employee1> ls = new ArrayList<>();
		
		ls.add(new Employee1(3, "Laptop", "taptop@gmail.com"));
		ls.add(new Employee1(2, "Aaptop", "zaptop@gmail.com"));
		ls.add(new Employee1(5, "Faptop", "japtop@gmail.com"));
		ls.add(new Employee1(4, "Taptop", "waptop@gmail.com"));
		ls.add(new Employee1(1, "Baptop", "kptop@gmail.com"));
		
		System.out.println(ls);
		
		Collections.sort(ls, new SortByName());
		
		System.out.println(ls);
		
		System.out.println("By Email");
		
		Collections.sort(ls, new SortByEmail());
		
		System.out.println(ls);
		
		System.out.println("By Id");
		
		Collections.sort(ls,new SortById());
		
		System.out.println(ls);
		
	}

}
