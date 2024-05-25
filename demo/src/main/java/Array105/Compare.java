package Array105;

import java.util.Arrays;

public class Compare {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6};
		int b[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6};

		System.out.println(Arrays.equals(a, b));
		
		int a1 = a.length;
		int b1 = b.length;
		
		if(a1==b1) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
	}
}
