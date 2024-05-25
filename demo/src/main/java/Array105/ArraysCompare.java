package Array105;

import java.util.Arrays;

public class ArraysCompare {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 78, 9 ,78,101,101,10,11};
		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 78, 9 ,78,101,101,10,11};

		
		System.out.println(Arrays.equals(a, b));
		
	}

}
