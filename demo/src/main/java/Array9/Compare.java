package Array9;

import java.util.Arrays;

public class Compare {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,1,2,3,4,5};
		
		int[] b = {1,2,3,4};
		
		// Concat
		
		int a1 = a.length;
		int b1 = b.length;
		
		
		int c[] = new int[a1+b1];
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		
		System.out.println("Concat = " + Arrays.toString(c));
		
		//Compare
		
		System.out.println(  " Compare = " + Arrays.equals(a, b));
		
		//Dublicate
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println( "Dublicate Value = " + a[i]);
				}
			}
		}
		
		// NonDublicate
		boolean chk;
		for(int i = 0; i<a.length; i++) {
			chk = false;
			for(int j = i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					chk = true;
					continue;
				}
			}
			
			if(!chk) System.out.print("NonDublicate = " + a[i] + " ");
		}
		
		
		
	}

}
