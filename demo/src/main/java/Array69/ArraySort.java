package Array69;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,4,6,6,7,1,2,3,4};
		
		Arrays.sort(a);
		
		System.out.print(Arrays.toString(a));
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp  =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			System.out.println(a[i]);
		}
	}

}
