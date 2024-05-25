package Array56;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String str[] = {"vishnu","avtar","vishnuavtar","VishnuAvtar"};
		
		for(int i = str.length-1; i>=0; i--) {
			System.out.println(str[i]);
		}
		
		
		List<String> list = Arrays.asList(str);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
	}

}
