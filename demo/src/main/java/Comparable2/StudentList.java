package Comparable2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(3,"vishnuavtar"));
		list.add(new Student(2,"avtar"));
		list.add(new Student(1,"vishnu"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
