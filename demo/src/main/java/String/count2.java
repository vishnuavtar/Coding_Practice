package String;

import java.util.HashMap;

public class count2 {

	public static void main(String[] args) {

		String str = "This is my job job";

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String[] str2 = str.split(" ");

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
