package String20;

import java.util.HashMap;

public class WOrdCount {

	public static void main(String[] args) {

		String str = "This is a kjfngbkjf dkjnvjk lkwef jwnef city This is a city This is a city This is a city";

		HashMap<String, Integer> map = new HashMap<>();

		String[] str2 = str.split(" ");

		for (String str3 : str2) {
			Integer i = map.get(str3);
			
			if(i==null) {
				map.put(str3, 1);
			}else {
				map.put(str3, i+1);
			}
		}
		
		System.out.println(map);

	}

}
