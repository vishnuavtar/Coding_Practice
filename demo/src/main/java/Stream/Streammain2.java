package Stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streammain2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i:list) {
			if(i%2==0) {
				list2.add(i);
			}
		}
		
		System.out.print(list);
		System.out.print(list2);
		
		List<Integer> newlist = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		
		List<Integer> glist = list.stream().filter(i->i>5).collect(Collectors.toList());
		System.out.println(glist);
		
		int max = list.size();
				int n = list.get(0);
				
				for(int i = 0; i<n; i++) {
					if(list.get(i)>max) {
						max=list.get(i);
					}
					
					System.out.println(max);
				}
				
				
				
				
				
				
				
	}

}
