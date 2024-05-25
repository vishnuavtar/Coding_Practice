package Array84;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiedList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(21);
		list.add(30);
		list.add(13);

		System.out.println(list);

		List<Integer> list2 = Collections.unmodifiableList(list);
		
		System.out.println(list2);
	}

}
