package ListOfStrudent;

import java.util.ArrayList;
import java.util.List;

public class Student2Main {
	
	public static void main(String[] args) {
		
		List<Student2>  list = new ArrayList<Student2>();
		list.add(new Student2(1,"Vishnu"));
		list.add(new Student2(2,"Avtar"));
	
		
		for(Student2 a : list) {
			System.out.println(a.getId());
			System.out.println(a.getName());
		}
		
	}

}
