package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap4 {
	
	public static void main(String[] args) {
		
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("d", "abcde");
		map.put("e", "abcdef");
		map.put("a", "ab");
		map.put("b", "abc");
		map.put("c", "abcd");
		
		
		System.out.println(map);
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		TreeMap tree = new TreeMap<>(map);
		System.out.println(tree);
		
		System.out.println();
		
	}

}
