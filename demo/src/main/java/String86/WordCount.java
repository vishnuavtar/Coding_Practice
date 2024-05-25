package String86;

import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {

		String str = "This is Bangalore";

		String str2[] = str.split(" ");

		HashMap<String, Integer> map = new HashMap<>();

		for (String str3 : str2) {
			Integer i = map.get(str3);
			if (i == null) {
				map.put(str3, 1);
			} else {
				map.put(str3, i + 1);
			}
		}

		System.out.println(map);
	}

}
