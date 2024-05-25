package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMap6 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Mohan", "mohan2");
		map.put("Sohan", "Sohan2");
		map.put("Rohan", "Rohan2");
		
		System.out.println(map);
		
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			System.out.println();
		}
		
		TreeMap<String, String> tree = new TreeMap<>(map);
		System.out.println(tree);
		
		HashMap<String, String> map2 = new HashMap<>();
		
		map2.put("Laptop", "laptop2");
		map2.put("Computer", "Computer2");
		map2.put("desktop", "desktop2");
		
		map2.putAll(map);
		System.out.println(map2);
		
		
		
		if(map.containsKey("Sohan")) {
			System.out.println("present");
		}else {
			System.out.println("Not Present");
		}
		
		
		if(map.containsValue("Mohan")) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
		if(map2.isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println("Not Empty");
		}
		
		
		
	}

}
