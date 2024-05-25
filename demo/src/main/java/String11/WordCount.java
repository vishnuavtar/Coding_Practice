package String11;

import java.util.HashMap;

public class WordCount {
	
	public static void main(String[] args) {
		
		
		String str1 = "This is my job";
		
		HashMap<String , Integer> map = new HashMap<>();
		
		String[] str2 = str1.split(" ");
		
		for(String str3:str2) {
			
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
