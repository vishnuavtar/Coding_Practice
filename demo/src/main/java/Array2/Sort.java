package Array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,1,2,3,4,5,6,7,8,9};
		
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
		
		// Stream sort
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9);
	
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		
	}

}
