package Array60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String str[] = {"vishnu","avtar","vishnuavtar","Vishnu","Avtar","VishnuAvtar"};
		
//		for(int i = str.length-1; i>=0; i--) {
//			System.out.println(str[i]);
//		}
		
//		for(int i = 0; i<str.length; i++) {
//			for(int j = i+1; j<str.length; j++) {
//				String temp = str[i];
//				str[i] = str[j];
//				str[j] = temp;
//			}
//			
//			System.out.println(str[i]);
//		}
		
		List<String> list = Arrays.asList(str);
		
		System.out.println(list);
		
		
		
		
		
		
	}

}
