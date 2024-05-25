package March4;

import java.util.HashMap;

public class Map1 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("a", "abc");
		map.put("a", "abcd");
		
		System.out.println(map);
	}

}
