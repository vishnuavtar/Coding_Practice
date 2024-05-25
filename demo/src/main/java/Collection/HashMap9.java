package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap9 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("a", "Apna");
		map.put("e", "Elephant");
		map.put("f", "friend");
		map.put("b", "goa");
		map.put("h", "Hello");
		map.put("c", "cat");
		map.put("d", "delhi");
		map.put("g", "Bihta");
		
		
		System.out.println(map);
		
		
		for(Map.Entry<String, String> s : map.entrySet()) {
			System.out.println(s.getKey() + "  " + s.getValue());
			
		}
		
	TreeMap<String, String> tree = new TreeMap<String, String>(map);
	System.out.println(tree);
	
			
	}

}
