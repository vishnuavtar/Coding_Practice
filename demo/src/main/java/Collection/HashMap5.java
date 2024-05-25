package Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "ab");
		map.put(3, "abc");
		map.put(4, "abcd");
		map.put(5, "abcde");
		map.put(6, "abcdef");

//		System.out.println(map);
//		
//		for(Map.Entry entry:map.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//		
//		// size
//		
//		System.out.println(map.size());
//		
//		HashMap<Integer,String> map2 = new HashMap<>();
//		System.out.println(map2);
//		map2.putAll(map);
//		System.out.println(map2);
//		
//		if(map.isEmpty()) {
//			System.out.println("EMpty");
//		}else {
//			System.out.println("Not empty");
//		}
//		
//		if(map.containsValue("a")) {
//			System.out.println("Value is present = " + map.get(1));
//		}else {
//			System.out.println("Not Present");
//		}
//		
//		if(map.containsKey(1)) {
//			System.out.println("Key is present = " + map.get(1));
//		}else {
//			System.out.println("Not present");
//		}
//		
//		Set set = map.entrySet();
//		
//		System.out.println("By Set = " + set);
//		
//		Set set2 = map.keySet();
//		
//		System.out.println(set2);
//	}

		class sort implements Comparator<String> {

			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}

		}

	}
}
