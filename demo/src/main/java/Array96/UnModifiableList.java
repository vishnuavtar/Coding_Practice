package Array96;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(11);
		list.add(13);
		list.add(12);
		list.add(15);

		System.out.println(list);

		List<Integer> list2 = Collections.unmodifiableList(list);
		// list2.add(100);
		System.out.println(list2);
	}
}
