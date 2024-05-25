package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("a", "vishnu");
		map.put("b", "avtar");
		map.put("c", "vishnuavtar");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
