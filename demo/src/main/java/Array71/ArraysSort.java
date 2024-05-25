package Array71;

import java.util.Arrays;

public class ArraysSort {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,1,2,3};
		
		int b[] = Arrays.stream(a).sorted().toArray();
		
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
