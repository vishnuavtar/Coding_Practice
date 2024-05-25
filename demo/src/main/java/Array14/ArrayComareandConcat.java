package Array14;

import java.util.Arrays;

public class ArrayComareandConcat {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = {1,2,3,4};
		
		int a1 = a.length; 
		int b1 = b.length;
		
		int c[] = new int[a1+b1];
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		
		System.out.print(Arrays.toString(c));
		
		
		// Compare
		
		System.out.println(Arrays.equals(a, b));
	}

}
