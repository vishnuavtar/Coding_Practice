package Comparable1231;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		
		list.add(new Student(3,"Vishnu Avtar"));
		list.add(new Student(1,"Vishnu"));
		list.add(new Student(2,"Avtar"));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
