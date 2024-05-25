package Comparator12;

import java.util.ArrayList;
import java.util.Collections;

import Comparable12.Employee;

public class StudentList {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Vishnu","vishnu@gmail.com"));
		list.add(new Student(3,"AvtarVishnu","AvtaVishnu@gmail.com"));
		list.add(new Student(2, "AVishnu", "AVishnu@gmail.com"));
		
		System.out.println(list);
		//Collections.sort(list, new SOrtByName());
		Collections.sort(list,new SOrtByName());
		System.out.println(list);
	}
	


}
