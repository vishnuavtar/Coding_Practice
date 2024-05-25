package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap15 {

	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "laptop");
		map.put(2, "pc");
		map.put(3, "monitor");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
