package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("a", "abc");
		map.put("b", "abc");
		map.put("c", "abc");
		map.put("d", "abc");
		map.put("e", "abc");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() +  " " + entry.getValue());
		}
		
		System.out.println(map.get("e"));		
	}

}
