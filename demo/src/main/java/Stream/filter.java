package Stream;

import java.util.*;
import java.util.stream.*;


public class filter {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,2,3,41,51,6,7,8,9);
	System.out.println(list);
	
	
	System.out.println(list.stream().filter(i -> i%2==0).collect(Collectors.toList()));
	
	List<Integer> newList= list.stream().filter(i -> i%2==0).collect(Collectors.toList());
	System.out.println(newList);
	
	System.out.print("By Filter = " + list.stream().filter(i-> i<5).collect(Collectors.toList()));
	
	Collections.sort(list);
	//System.out.print(list);
	List<Integer>  new2 = list.stream().sorted().collect(Collectors.toList());
	System.out.print(new2);
	
	
	// map
	
	System.out.print("By  Map = " + list.stream().map(i->i*2).collect(Collectors.toList()));
	
//	List <String> slist = {"a","b","c","d","e"};
//	list.stream().map(String::toUpperCase).
//	        collect(Collectors.toList());
	
	
	List<String> s = Arrays.asList("hjdbsh","hudgcy","gdwa","uyshc","yuearg");
	s.stream().map(i->i.length()).forEach(System.out::println);
	
	System.out.println(list.stream().sorted().collect(Collectors.toList()));
	Collections.sort(list,Collections.reverseOrder());
	System.out.println(list);
		
	}
	
}
