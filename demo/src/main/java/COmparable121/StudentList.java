package COmparable121;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"Vishnu","vishnu@gmail.com"));
		list.add(new Student(3,"vishnuavtar","vishnuavtar@gmail.com"));
		list.add(new Student(2,"Avtar","avtar@gmail.com"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	
	}

}
