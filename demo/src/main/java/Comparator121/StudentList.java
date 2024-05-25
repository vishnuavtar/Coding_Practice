package Comparator121;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import COmparator123.SOrtById;

public class StudentList {
	
	
		public static void main(String[] args) {
			
			List<Student> list = new ArrayList<>();
			
			
			list.add(new Student(3,"Vishnu Avtar"));
			list.add(new Student(1,"Vishnu"));
			list.add(new Student(2,"Avtar"));
			
			System.out.println(list);
			
			Collections.sort(list , new SortById());
			System.out.println(list);
			
			Collections.sort(list , new SortByName());
			System.out.println(list);
			
		}

	}



