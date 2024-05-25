package ComhrablAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"Mohan"));
		list.add(new Student(2,"Sohan"));
		list.add(new Student(3,"Tohan"));
		list.add(new Student(4,"Patna"));
		list.add(new Student(5,"Laptop"));
		
		
		System.out.println(list);
		
		Collections.sort(list);
	}

}
