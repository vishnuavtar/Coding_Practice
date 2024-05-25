package Array68;

import java.util.ArrayList;
import java.util.List;


public class ArrayToList {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> list = new ArrayList<>();
		
		for(Integer e:a) {
			list.add(e);
		}
		
		System.out.println(list);
		
	}

}
