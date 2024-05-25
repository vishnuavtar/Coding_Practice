package Array52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String[] a = {"Vishnu","avtar","vishnuavtar","laptop","pc"};
		
		List<String> list = Arrays.asList(a);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
	}

}
