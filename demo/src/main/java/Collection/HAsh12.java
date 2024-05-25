package Collection;

import java.util.HashMap;
import java.util.Map;

public class HAsh12 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("c", "VishnuAvtar");
		map.put("a", "Vishnu");
		map.put("b", "Avtar");
		
		System.out.println(map);
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

}
