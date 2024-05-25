package Array100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModified {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);

		System.out.println(list);

		List<Integer> list2 = Collections.unmodifiableList(list);

		// list2.add(1001);

		System.out.println(list2);

		List<Integer> list3 = Arrays.asList(123);
		//list3.add(100);

		System.out.println(list3);

		List<Integer> list4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		list4.add(100);

		System.out.println(list4);

	}

}
