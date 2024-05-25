package String3;

import java.util.HashMap;

public class Count2 {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		HashMap<String , Integer> map = new HashMap<>();
		
		String[]  s = str.split(" ");
		
		for (String ss : s) {
			
			Integer  i = map.get(ss);
			
			if(i==null) {
				map.put(ss, 1);
			}else {
				map.put(ss, i+1);
			}
		}
		
		System.out.println(map);
		
	
		
	}

}
