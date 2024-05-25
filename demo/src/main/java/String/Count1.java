package String;

import java.util.HashMap;

public class Count1 {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		HashMap<String , Integer> map = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for(String word: words) {
			Integer i = map.get(words);
			
			if(i==null) {
				map.put(word, 1);
			}else {
				
				map.put(word, i+1);
		}
		
		
			
		}
		
		System.out.println(map);
	}

}
