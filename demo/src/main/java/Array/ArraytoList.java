package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoList {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,1,2,3,4};
		
		String[] s = {"aaa","bbb","ccc","ddd","eee"};
		
		List l = Arrays.asList(s);
		System.out.println(l);
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		
		
		
	}

}
