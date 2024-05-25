package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapList {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("n", "abc");
		map.put("t", "jht");
		map.put("p", "pou");
		map.put("y", "kly");
		map.put("e", "juy");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ " = " + entry.getValue());
		}
	}

}
