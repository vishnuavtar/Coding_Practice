package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap121 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("a", "laptop");
		map.put("b", "pen");
		map.put("d", "Avtar");
		map.put("e", "vishnuavtar");
		map.put("c", "Vishnu");

		System.out.println(map);

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println(map.get("c"));

		if (map.containsValue("Vishnu")) {
			System.out.println("Ok");
		}

		if (map.containsKey("c")) {
			System.out.println("ok");
		}

	}

}
