package Comparator1;


import java.util.ArrayList;
import java.util.Collections;

import Comparable12.Employee;

public class StudentLIst {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list  = new ArrayList<>();
		list.add(new Student(10,"Vishnu Avtar","Vishnu@gmail.com"));
		list.add(new Student(30,"Sohan","vishnu@ga"));
		list.add(new Student(40,"TOhan","avta@gmail"));
		list.add(new Student(50,"ROhan","va@gmail"));
		list.add(new Student(20,"Mohan","vk@gmail"));
		
		
		
		
		//System.out.println(list);
		
		//Collections.sort(list,new SOrtById());
		
		System.out.println(list);
		
		Collections.sort(list, new SortByName());
		
		System.out.println(list);
		
	}

}
