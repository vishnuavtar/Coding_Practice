package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StuentList {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student(4, "Computer"));
		list.add(new Student(5, "Pen"));
		list.add(new Student(6, "Copy"));

		list.add(new Student(1, "Vishnu"));
		list.add(new Student(2, "Avtar"));
		list.add(new Student(3, "laptop"));

		Collections.sort(list);
		System.out.println(list);

	}

}
