package Composition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StuentList {
	
	public static void main(String[] args) {
		
		Student s4 = new Student(4, "Laptop");
		Student s5 = new Student(5, "Pc");
		Student s6 = new Student(6, "Copy");
		
		
		Student s1 = new Student(1, "Vishnu Avtar");
		Student s2 = new Student(2, "Avtar Vishnu");
		Student s3 = new Student(3, "Mohan");
		
		
		List<Student> list = new ArrayList<>();
		
		list.add(s3);
		list.add(s2);
		list.add(s1);
		list.add(s6);
		list.add(s5);
		list.add(s4);
		
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, new SortBuyNAme());
		
		System.out.println(list);
	}

}
