package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("c", "hjk");
		map.put("d", "tyu");
		map.put("e", "rty");
		map.put("a", "abc");
		map.put("b", "abcd");
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		if(map.isEmpty()) {
			System.out.println("empty");
		}else {
			System.out.println("Available");
		}
		
		
		
		
		
		
		System.out.println(map);
		
	}
}
