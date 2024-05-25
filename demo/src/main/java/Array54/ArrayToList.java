package Array54;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String[] str = {"Vishnu","Avtar","vishnu","avtar","VishnuAvtar","vishnuavtar"};
		
		for(int i =  str.length-1; i>=0; i--) {
			System.out.println(str[i]);
		}
		
		
		List<String> list = Arrays.asList(str);
		
		System.out.println(list);
		
		
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println("Biggest String");
		
		System.out.println(list.stream().max(String::compareTo).get());
		
		System.out.println("Smallest String");
		
		System.out.println(list.stream().min(String::compareTo).get());

	}

}
