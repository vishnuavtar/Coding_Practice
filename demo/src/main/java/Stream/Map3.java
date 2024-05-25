package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("This is my job");
		list.add("This is my job");
		list.add("This is my job");
		list.add("This is my job");
		list.add("This is my job");
		
		list.stream().flatMap(i->Stream.of(i.charAt(2))).forEach(System.out::print);
		
		System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
	
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
		System.out.println(list2.stream().max(Integer::compare).get());
		System.out.println(list2.stream().min(Integer::compare).get());
		System.out.println(list2.stream().map(i->i*10).collect(Collectors.toList()));
		
		
		
		
	}

}
