package Array88;

import java.util.Arrays;

public class Concate {
	
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 1, 2, 34, 4, 1, 23, 4 };
		int b[] = { 1, 2, 3, 4, 1, 2, 34, 4, 1, 23, 4 };

		int a1 = a.length;
		int b1=  b.length;
		
		int c[] = new int[a1+b1];
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		
		System.out.println(Arrays.toString(c));
	}

}
