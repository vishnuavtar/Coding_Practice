package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListForComparable {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(13,"Rohan2"));
		list.add(new Student(15,"Rohan4"));
		list.add(new Student(10,"Mohan"));
		list.add(new Student(11,"Sohan"));
		list.add(new Student(12,"Rohan"));
		
		
//		for(Student ss:list) {
//		System.out.println(ss.getId() + " " + ss.getName());
//		}
		
		//System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
