package MaxMinREpeatedValueInArray;

import java.util.ArrayList;
import java.util.List;

public class One {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		list.add(20);
		list.add(20);

		System.out.println(list);

		System.out.println(list.stream().max(Integer::compare).get());

	}

}
