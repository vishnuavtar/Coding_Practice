package Array75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SingleValue {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6,7,8,1,2,3};
		boolean chk;
		
		Integer[] aa = Arrays.stream(a).toArray(Integer[]::new);	
		
		System.out.println(Arrays.toString(aa));
		
		List<Integer> list = new ArrayList<>();
		
		HashSet<Integer> set = new HashSet<>();
		
		for(Integer e:aa) {
			list.add(e);
		}
		
		System.out.println(list);
		
		System.out.println(list.stream().filter(i->set.add(i)).collect(Collectors.toList()));
		
		
		
		
		for(int i = 0; i<a.length; i++) {
			chk = false;
			for(int j = i+1; j<a.length; j++) {
				if(i!=j && a[i]==a[j]) {
					chk = true;
				}
			}
			
			if(!chk) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
