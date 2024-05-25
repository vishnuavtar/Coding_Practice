package Array72;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysSort {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6,7,8,9,1,2,3,43};
		
		
		List<Integer> list = new ArrayList<>();
		
		for(Integer e:a) {
			list.add(e);
		}
		
		System.out.println(list);
		
		list.stream().sorted().forEach(System.out::print);
		
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			System.out.println(a[i]);
		}
	}

}
