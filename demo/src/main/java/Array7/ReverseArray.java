package Array7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,11,1,2,3,4,10,4,5};
		
		for(int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		
		List list = new ArrayList<>();
		list.add(a);
		System.out.println(list);
	}

}
