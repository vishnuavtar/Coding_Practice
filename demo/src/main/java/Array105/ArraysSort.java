package Array105;

import java.util.Arrays;

public class ArraysSort {
	
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,1,2,3,45,5};
		
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
		
		
		
		Arrays.stream(a).sorted().forEach(System.out::print);
		
		
	}

}
