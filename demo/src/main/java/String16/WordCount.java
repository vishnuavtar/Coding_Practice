package String16;

import java.util.HashMap;

public class WordCount {

	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		HashMap<String,Integer> map = new HashMap<>();
		
		String[]  str1 = str.split(" ");
		
		for(String str2 : str1) {
			Integer i = map.get(str2);
			if(i==null) {
				 map.put(str2, 1);
			}else {
				map.put(str2, i+1);
			}
		}
		
		System.out.println(map);
		
	}
}
