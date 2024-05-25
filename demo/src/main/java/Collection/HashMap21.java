package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap21 {
	
	public static void main(String[] args) {
		
		
		HashMap<String,String> map = new HashMap<String, String>();
		
		map.put("p", "VishnuAvtar");
		map.put("t", "Vishnu");
		map.put("a", "vishnu");
		map.put("b", "avtar");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		TreeMap<String,String> tree = new TreeMap<>(map);
		
		System.out.println(tree);
		
	}

}
