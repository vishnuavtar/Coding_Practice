package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap8 {
	
	public static void main(String[] args) {
		
		HashMap<String , String> map = new HashMap<>();
		
		map.put("a", "Mohan");
		map.put("b", "Rohan");
		map.put("c", "Laptop");
		map.put("d", "Computer");
		map.put("e", "Building");
		
		System.out.println(map);
		
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

				
	}

}
