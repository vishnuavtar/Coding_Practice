package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(50);
		list.add(60);
		list.add(70);
		list.add(801);
		list.add(90);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(11);
		list.add(50);
		list.add(63);
		list.add(73);
		list.add(17);
		list.add(13);
		list.add(100);

		System.out.println(list);

		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());

		// Filter

		System.out.println(list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

		System.out.println(list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()));

		System.out.println("All value divided by 3");

		System.out.println(list.stream().filter(i -> i % 3 == 0).collect(Collectors.toList()));

		System.out.println(list.stream().map(i -> (i * 10)).collect(Collectors.toList()));

		System.out.println(list.stream().flatMap(i -> Stream.of(i % 2 == 0)).collect(Collectors.toList()));

		System.out.println(list.stream().flatMap(i -> Stream.of(i % 2 != 0)).collect(Collectors.toList()));

		Collections.sort(list);

		System.out.println(list);

		System.out.println(list.stream().sorted().collect(Collectors.toList()));

	}

}
