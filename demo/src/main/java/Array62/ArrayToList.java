package Array62;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		String[] str = {"vishnu","avtar","vishnuavtar","Vishnu","Avtar","VishnuAvtar"};
		
		List<String> list = Arrays.asList(str);
		
		System.out.println(list);
		
	}

}
