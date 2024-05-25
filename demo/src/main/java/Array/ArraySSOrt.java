package Array;

import java.util.Arrays;

public class ArraySSOrt {
	
	public static void main(String[] args) {
		
		int a[] = {1,4,5,6,7,1,2,3,4};
		
		
		
		for(int i = 0; i<a.length; i++) {
			
			Arrays.sort(a);
			System.out.println(a[i]);
			
		}
		
		
	}

}
