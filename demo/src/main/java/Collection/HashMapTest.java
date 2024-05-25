package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("a", "Delhi");
		map.put("c", "Hyderabad");
		map.put("b", "Kolkatta");
		map.put("d", "Bangalore");
		map.put("e", "Japana");
		
	
		
		System.out.println(map);
		
		for(Map.Entry<String, String>  e : map.entrySet()) {
			
			System.out.println(e.getKey() + " "  + e.getValue());
			System.out.println();
			
		}
		
		
		System.out.println("By HashTable");
		
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("a", "Delhi");
		table.put("c", "Hyderabad");
		table.put("b", "Kolkatta");
		table.put("d", "Bangalore");
		table.put("e", "Japana");
		
		System.out.println(table);
		
		
		for(Map.Entry<String, String> ss : map.entrySet()) {
			System.out.println(ss.getKey() + " " + ss.getValue());
		}
		
		System.out.println(map.get("e"));
		
	}

}
