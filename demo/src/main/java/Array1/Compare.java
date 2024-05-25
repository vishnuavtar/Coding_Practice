package Array1;

import java.util.Arrays;

public class Compare {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,9};
		int b[] = {1,2,3,4,5};
		
		System.out.println(Arrays.equals(a, b));
		
		int a1 = a.length;
		int b1 = b.length;
		
		int[] c = new int[a1+b1];
		
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(a, 0, c, a1, b1);
		
		System.out.println(Arrays.toString(c));
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		
		
	}
}
