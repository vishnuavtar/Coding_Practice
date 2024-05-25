package Collection;

import java.util.ArrayList;
import java.util.List;

public class List4 {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(1);
		list.add(50);
		
		
		int max = list.get(0);
		int n = list.size();
		
		
		for(int i = 0; i<n; i++) {
			if(list.get(i)>max) {
				max = list.get(i);
			}
			
			
		
			
		}
		System.out.println(max);
		
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
	}
}
