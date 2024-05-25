package Array11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTOList {
	
	public static void main(String[] args) {
		
		int a[] = {4,5,61,2,3,4,5,6,7,8,9};
		String ch[] = {"a","ra","sa","ad","ga"};

	
			List<String> list = Arrays.asList(ch);
			System.out.println(list);
			Collections.sort(list, Collections.reverseOrder());
			System.out.println(list);
		
		
		
		
		
		
		
		
		
	}

}
