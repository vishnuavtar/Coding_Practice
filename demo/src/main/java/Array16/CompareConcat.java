package Array16;

import java.util.Arrays;

public class CompareConcat {
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6};
		int b[] = {1,2,3,4,5};
		
		// compare
		
		System.out.println(Arrays.equals(a, b));
		
		// concat
		
		int a1 = a.length;
		int b1 = b.length;
		
		int c[] = new int[a1+b1];
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		
		System.out.println(Arrays.toString(c));
		
	}

}
