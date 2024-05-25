package Array93;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnModified {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(13);

		System.out.println(list);

		List<Integer> list2 = Collections.unmodifiableList(list);

		//list2.add(100);
		System.out.println(list2);
	}

}
