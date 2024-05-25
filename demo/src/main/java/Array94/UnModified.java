package Array94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModified {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(9);

		System.out.println(list);

		List<Integer> list2 = Collections.unmodifiableList(list);

		// list2.add(100);

		System.out.println(list2);

		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		//list3.add(22);

		System.out.println(list3);

		List<Integer> list4 = List.of(1, 2, 3, 4, 5, 6, 7, 8);

		list4.add(1000);

		System.out.println(list4);

	}

}
