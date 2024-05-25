package Compareb1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	
	public static void main(String[] args) {
		
		
		List<Student> list = new ArrayList<>();
		
		
		list.add(new Student(4,"Vishnu","Vishnu@gmail.com"));
		list.add(new Student(5,"Avtar","Avtar@gmail.com"));
		list.add(new Student(6,"VishnuAvtar","VishnuAvtar@gmail.com"));
		list.add(new Student(1,"vishnu","vishnu@gmail.com"));
		list.add(new Student(2,"avtar","avtar@gmail.com"));
		list.add(new Student(3,"vishnuavtar","vishnuavtar@gmail.com"));
		
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}
