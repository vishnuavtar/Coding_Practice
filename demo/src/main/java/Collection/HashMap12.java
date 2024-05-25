package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap12 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("h", "car");
		map.put("z", "ok");
		map.put("k", "building");
		map.put("d", "ko");
		map.put("e", "shop");

		
		System.out.println(map);
		
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		TreeMap<String,String> tmap = new TreeMap<>(map);
		System.out.println(tmap);
		
	}

}
