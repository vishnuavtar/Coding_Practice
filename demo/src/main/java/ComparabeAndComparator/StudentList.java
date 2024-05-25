package ComparabeAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list  = new ArrayList<>();
		list.add(new Student(10,"Vishnu Avtar"));
		list.add(new Student(30,"Sohan"));
		list.add(new Student(40,"TOhan"));
		list.add(new Student(50,"ROhan"));
		list.add(new Student(20,"Mohan"));
		
		
		
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
