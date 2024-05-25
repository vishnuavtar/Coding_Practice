package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoList1 {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		
		List list = Arrays.asList(a);
		Collections.sort(list,Collections.reverseOrder());		
		
	}

}
