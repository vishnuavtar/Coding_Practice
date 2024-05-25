package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList6 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); 
		
		list.add(80);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(101);
		
		System.out.println(list);
		
	 System.out.println(list.stream().min(Integer::compare).get());
	 System.out.println(list.stream().max(Integer::compare).get());
	 
	 System.out.println(list.stream().min(Integer::compare).isEmpty());
	 
	 System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
	 System.out.println(list.stream().filter(i->i%2!=0).collect(Collectors.toList()));
	 
	 System.out.println(list.stream().filter(i->i>90).collect(Collectors.toList()));
	 
	 System.out.println(list.stream().filter(i->i%5==0).collect(Collectors.toList()));
	 
	 System.out.println(list.stream().map(i->i*10).collect(Collectors.toList()));
	 
	 
	 
	 

		
	}

}
