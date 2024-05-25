package Comparable123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentLIst {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"Vishnu","vishnu@gmmail.com"));
		list.add(new Student(3,"iVshnu","vishnu@gmmail.com"));
		list.add(new Student(2,"Aishnu","vishnu@gmmail.com"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
