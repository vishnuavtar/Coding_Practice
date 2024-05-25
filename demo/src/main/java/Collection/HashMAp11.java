package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMAp11 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		map.put("n", "laptop");
		map.put("k", "pc");
		map.put("u", "house");
		map.put("t", "country");
		map.put("i", "apple");

		System.out.println(map);

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
