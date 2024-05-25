package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import Array.reverseArray;

public class Lsit10 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(21);

		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);

		System.out.println(list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
		System.out.println(list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList()));

		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());

		list.stream().map(i -> i * 10).forEach(System.out::print);
		
		list.stream().flatMap(i->i*8).collect(Collectors.toList());

	}

}
