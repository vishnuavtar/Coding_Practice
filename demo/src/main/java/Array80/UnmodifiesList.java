package Array80;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiesList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);

		System.out.println(list);

		list.add(15);

		System.out.println(list);

		List<Integer> list2 = Collections.unmodifiableList(list);

		System.out.println(list2);

	}

}
