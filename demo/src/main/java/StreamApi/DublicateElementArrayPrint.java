package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class DublicateElementArrayPrint {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Collections.addAll(list,1,2,3,4,5,6,7,8,9,1,2,3,4);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.println(list.stream().filter(i->!set.add(i)).collect(Collectors.toList()));
		
		List<Integer> list2 = Collections.unmodifiableList(list);
		
		System.out.println(list2);
		
		
		
	}

}
