package ComparableSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student(3, "Vishnu Avtar", "vishnuavtar@gmail.com"));
		list.add(new Student(1, "Vishnu", "vishnu@gmail.com"));
		list.add(new Student(2, "Avtar", "Avtar@gmail.com"));

		System.out.println(list);

		Collections.sort(list,new StudentSortById());

		System.out.println("After sort by id");

		System.out.println(list);
		
		System.out.println("Sort By Name");
		Collections.sort(list , new StudentSortByName());
		
		System.out.println(list);
		
		System.out.println("Student Sort By Email");
		
		Collections.sort(list,new StudentSortByEmail());
		
		
	}

}
