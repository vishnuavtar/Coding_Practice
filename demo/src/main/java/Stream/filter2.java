package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,22,11,44,55,33,77,99,44,22,45);
		System.out.println(list);
		
		int n = list.size();
		int max = list.get(0);
		
		for(int i = 0; i<n; i++) {
			if(list.get(0)>max) {
				max = list.get(0);
			}
			
			
		}
		
		System.out.println(max);
		
		List<Integer> newList = list.stream().filter(i->i>40).collect(Collectors.toList());
		System.out.println(newList);
	}
	

}
