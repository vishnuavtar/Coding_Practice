package Comparator1;


import java.util.Comparator;

import Comparable12.Employee;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}



}
