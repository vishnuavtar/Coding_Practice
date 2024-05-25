package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map  = new  HashMap<>();
		map.put("a", "abc");
		map.put("b", "abcd");
		map.put("c", "kkk");
		map.put("d", "dddd");
		map.put("e", "eee");
		map.put("1" , "");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	
	}

}
