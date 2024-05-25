package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap10 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		map.put("a", "Abc");
		map.put("b", "mno");
		map.put("c", "xyz");

		System.out.println(map);

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
